USE [master]
GO
/****** Object:  Database [Heladeria_Venezia]    Script Date: 2018/06/09 02:43:57 NM. ******/
CREATE DATABASE [Heladeria_Venezia] ON  PRIMARY 
( NAME = N'Heladeria_Venezia', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10.SQLEXPRESS\MSSQL\DATA\Heladeria_Venezia.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Heladeria_Venezia_log', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10.SQLEXPRESS\MSSQL\DATA\Heladeria_Venezia_log.LDF' , SIZE = 576KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Heladeria_Venezia] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Heladeria_Venezia].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Heladeria_Venezia] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET ARITHABORT OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Heladeria_Venezia] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Heladeria_Venezia] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Heladeria_Venezia] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Heladeria_Venezia] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Heladeria_Venezia] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Heladeria_Venezia] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Heladeria_Venezia] SET  MULTI_USER 
GO
ALTER DATABASE [Heladeria_Venezia] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Heladeria_Venezia] SET DB_CHAINING OFF 
GO
USE [Heladeria_Venezia]
GO
/****** Object:  User [madara]    Script Date: 2018/06/09 02:43:57 NM. ******/
CREATE USER [madara] FOR LOGIN [madara] WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  Table [dbo].[detalle_pedidos]    Script Date: 2018/06/09 02:43:57 NM. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[detalle_pedidos](
	[cod_detalle_pedido] [int] IDENTITY(1,1) NOT NULL,
	[cod_pedido] [int] NULL,
	[cod_producto] [int] NULL,
	[cantidad] [int] NULL,
	[pre_unitario] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_detalle_pedido] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[detalles_venta]    Script Date: 2018/06/09 02:43:57 NM. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[detalles_venta](
	[cod_detalle] [int] IDENTITY(1,1) NOT NULL,
	[id_venta] [int] NULL,
	[cod_producto] [int] NULL,
	[cantidad] [int] NULL,
	[prec_unitario] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_detalle] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Empleados]    Script Date: 2018/06/09 02:43:57 NM. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Empleados](
	[id_empleado] [int] IDENTITY(1,1) NOT NULL,
	[nro_tel] [varchar](100) NULL,
	[direccion] [varchar](40) NULL,
	[nombre] [varchar](50) NULL,
	[apellido] [varchar](50) NULL,
	[cargo] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_empleado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Pedidos]    Script Date: 2018/06/09 02:43:57 NM. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Pedidos](
	[cod_pedido] [int] IDENTITY(1,1) NOT NULL,
	[fecha] [varchar](50) NULL,
	[direccion] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_pedido] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Productos]    Script Date: 2018/06/09 02:43:57 NM. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Productos](
	[cod_producto] [int] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](50) NULL,
	[pre_venta] [int] NULL,
	[pre_compra] [int] NULL,
	[unidad_medida] [varchar](20) NULL,
	[cantidad] [int] NULL,
	[guardar_almacen] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_producto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Sueldo]    Script Date: 2018/06/09 02:43:57 NM. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sueldo](
	[id_sueldo] [int] IDENTITY(1,1) NOT NULL,
	[cuantoxhora] [int] NULL,
	[horas] [int] NULL,
	[id_empleado] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_sueldo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Ventas]    Script Date: 2018/06/09 02:43:57 NM. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ventas](
	[id_venta] [int] IDENTITY(1,1) NOT NULL,
	[id_empleado] [int] NULL,
	[fecha_venta] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_venta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Empleados] ON 

INSERT [dbo].[Empleados] ([id_empleado], [nro_tel], [direccion], [nombre], [apellido], [cargo]) VALUES (1, N'3512500', N'andres maria ampere 7741', N'ignacio', N'constable', N'1')
INSERT [dbo].[Empleados] ([id_empleado], [nro_tel], [direccion], [nombre], [apellido], [cargo]) VALUES (2, N'40245142', N'viracocha', N'Juancruz', N'constable', N'2')
SET IDENTITY_INSERT [dbo].[Empleados] OFF
SET IDENTITY_INSERT [dbo].[Pedidos] ON 

INSERT [dbo].[Pedidos] ([cod_pedido], [fecha], [direccion]) VALUES (1, N'Dic 12 1997 12:00AM', N'viracocha')
INSERT [dbo].[Pedidos] ([cod_pedido], [fecha], [direccion]) VALUES (3, N'1 asd', N'10 viracocha')
INSERT [dbo].[Pedidos] ([cod_pedido], [fecha], [direccion]) VALUES (4, N'MMM d, yyyy', N'asdadada')
INSERT [dbo].[Pedidos] ([cod_pedido], [fecha], [direccion]) VALUES (5, N'Thu Jun 14 12:49:18 ART 2018', N'aaaaaaaa')
INSERT [dbo].[Pedidos] ([cod_pedido], [fecha], [direccion]) VALUES (7, N'15 junio', N'ampere 7741')
SET IDENTITY_INSERT [dbo].[Pedidos] OFF
SET IDENTITY_INSERT [dbo].[Productos] ON 

INSERT [dbo].[Productos] ([cod_producto], [Descripcion], [pre_venta], [pre_compra], [unidad_medida], [cantidad], [guardar_almacen]) VALUES (2, N'Sprites', 28, 500, N'1', 20, 0)
SET IDENTITY_INSERT [dbo].[Productos] OFF
SET IDENTITY_INSERT [dbo].[Sueldo] ON 

INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado]) VALUES (19, 20, 40, 1)
INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado]) VALUES (20, 50, 40, 2)
INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado]) VALUES (21, 30, 20, 2)
INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado]) VALUES (22, 20, 20, 2)
INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado]) VALUES (23, 20, 30, 1)
INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado]) VALUES (24, 10, 50, 1)
SET IDENTITY_INSERT [dbo].[Sueldo] OFF
ALTER TABLE [dbo].[detalle_pedidos]  WITH CHECK ADD  CONSTRAINT [fk_cod_pedido] FOREIGN KEY([cod_pedido])
REFERENCES [dbo].[Pedidos] ([cod_pedido])
GO
ALTER TABLE [dbo].[detalle_pedidos] CHECK CONSTRAINT [fk_cod_pedido]
GO
ALTER TABLE [dbo].[detalle_pedidos]  WITH CHECK ADD  CONSTRAINT [fk_cod_product] FOREIGN KEY([cod_producto])
REFERENCES [dbo].[Productos] ([cod_producto])
GO
ALTER TABLE [dbo].[detalle_pedidos] CHECK CONSTRAINT [fk_cod_product]
GO
ALTER TABLE [dbo].[detalles_venta]  WITH CHECK ADD  CONSTRAINT [fk_cod_producto] FOREIGN KEY([cod_producto])
REFERENCES [dbo].[Productos] ([cod_producto])
GO
ALTER TABLE [dbo].[detalles_venta] CHECK CONSTRAINT [fk_cod_producto]
GO
ALTER TABLE [dbo].[detalles_venta]  WITH CHECK ADD  CONSTRAINT [fk_id_venta] FOREIGN KEY([id_venta])
REFERENCES [dbo].[Ventas] ([id_venta])
GO
ALTER TABLE [dbo].[detalles_venta] CHECK CONSTRAINT [fk_id_venta]
GO
ALTER TABLE [dbo].[Sueldo]  WITH CHECK ADD  CONSTRAINT [fk_empleado] FOREIGN KEY([id_empleado])
REFERENCES [dbo].[Empleados] ([id_empleado])
GO
ALTER TABLE [dbo].[Sueldo] CHECK CONSTRAINT [fk_empleado]
GO
ALTER TABLE [dbo].[Ventas]  WITH CHECK ADD  CONSTRAINT [fk_id_empleado] FOREIGN KEY([id_empleado])
REFERENCES [dbo].[Empleados] ([id_empleado])
GO
ALTER TABLE [dbo].[Ventas] CHECK CONSTRAINT [fk_id_empleado]
GO
USE [master]
GO
ALTER DATABASE [Heladeria_Venezia] SET  READ_WRITE 
GO
