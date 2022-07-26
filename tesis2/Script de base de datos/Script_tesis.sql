create database Heladeria_venezia
USE [Heladeria_Venezia]
GO
/****** Object:  User [madara]    Script Date: 2018/07/18 12:56:32 NM. ******/
CREATE USER [madara] FOR LOGIN [madara] WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  Table [dbo].[detalle_pedidos]    Script Date: 2018/07/18 12:56:33 NM. ******/
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
/****** Object:  Table [dbo].[detalles_venta]    Script Date: 2018/07/18 12:56:34 NM. ******/
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
/****** Object:  Table [dbo].[Egresos]    Script Date: 2018/07/18 12:56:34 NM. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Egresos](
	[cod_egreso] [int] IDENTITY(1,1) NOT NULL,
	[precio] [int] NULL,
	[fecha] [varchar](50) NULL,
	[descripcion] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_egreso] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Empleados]    Script Date: 2018/07/18 12:56:34 NM. ******/
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
/****** Object:  Table [dbo].[Pedidos]    Script Date: 2018/07/18 12:56:34 NM. ******/
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
/****** Object:  Table [dbo].[Productos]    Script Date: 2018/07/18 12:56:34 NM. ******/
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
PRIMARY KEY CLUSTERED 
(
	[cod_producto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Sueldo]    Script Date: 2018/07/18 12:56:34 NM. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Sueldo](
	[id_sueldo] [int] IDENTITY(1,1) NOT NULL,
	[cuantoxhora] [int] NULL,
	[horas] [int] NULL,
	[id_empleado] [int] NULL,
	[fecha] [varchar](50) NULL,
	[estado] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_sueldo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Ventas]    Script Date: 2018/07/18 12:56:34 NM. ******/
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
SET IDENTITY_INSERT [dbo].[detalle_pedidos] ON 

INSERT [dbo].[detalle_pedidos] ([cod_detalle_pedido], [cod_pedido], [cod_producto], [cantidad], [pre_unitario]) VALUES (1, 9, 2, 10, 500)
INSERT [dbo].[detalle_pedidos] ([cod_detalle_pedido], [cod_pedido], [cod_producto], [cantidad], [pre_unitario]) VALUES (2, 10, 4, 10, 500)
INSERT [dbo].[detalle_pedidos] ([cod_detalle_pedido], [cod_pedido], [cod_producto], [cantidad], [pre_unitario]) VALUES (3, 10, 3, 5, 100)
INSERT [dbo].[detalle_pedidos] ([cod_detalle_pedido], [cod_pedido], [cod_producto], [cantidad], [pre_unitario]) VALUES (4, 10, 2, 3, 500)
INSERT [dbo].[detalle_pedidos] ([cod_detalle_pedido], [cod_pedido], [cod_producto], [cantidad], [pre_unitario]) VALUES (5, 11, 3, 10, 100)
INSERT [dbo].[detalle_pedidos] ([cod_detalle_pedido], [cod_pedido], [cod_producto], [cantidad], [pre_unitario]) VALUES (6, 11, 2, 10, 500)
INSERT [dbo].[detalle_pedidos] ([cod_detalle_pedido], [cod_pedido], [cod_producto], [cantidad], [pre_unitario]) VALUES (7, 11, 4, 10, 500)
INSERT [dbo].[detalle_pedidos] ([cod_detalle_pedido], [cod_pedido], [cod_producto], [cantidad], [pre_unitario]) VALUES (8, 12, 3, 10, 100)
INSERT [dbo].[detalle_pedidos] ([cod_detalle_pedido], [cod_pedido], [cod_producto], [cantidad], [pre_unitario]) VALUES (9, 12, 2, 10, 500)
INSERT [dbo].[detalle_pedidos] ([cod_detalle_pedido], [cod_pedido], [cod_producto], [cantidad], [pre_unitario]) VALUES (10, 12, 4, 10, 500)
SET IDENTITY_INSERT [dbo].[detalle_pedidos] OFF
SET IDENTITY_INSERT [dbo].[detalles_venta] ON 

INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (1, 5, 2, 10, 28)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (2, 6, 2, 50, 28)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (3, 7, 2, 15, 28)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (4, 9, 4, 10, 800)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (5, 9, 4, 10, 800)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (6, 9, 4, 10, 800)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (7, 9, 4, 10, 800)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (8, 10, 3, 10, 400)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (9, 10, 3, 10, 400)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (10, 10, 3, 10, 400)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (11, 10, 3, 10, 400)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (12, 10, 3, 10, 400)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (13, 11, 2, 10, 28)
INSERT [dbo].[detalles_venta] ([cod_detalle], [id_venta], [cod_producto], [cantidad], [prec_unitario]) VALUES (14, 11, 2, 10, 28)
SET IDENTITY_INSERT [dbo].[detalles_venta] OFF
SET IDENTITY_INSERT [dbo].[Egresos] ON 

INSERT [dbo].[Egresos] ([cod_egreso], [precio], [fecha], [descripcion]) VALUES (1, 100, N'tomates', N'19/06/2018')
INSERT [dbo].[Egresos] ([cod_egreso], [precio], [fecha], [descripcion]) VALUES (2, 100, N'tomates', N'19/06/2018')
SET IDENTITY_INSERT [dbo].[Egresos] OFF
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
INSERT [dbo].[Pedidos] ([cod_pedido], [fecha], [direccion]) VALUES (8, N'asd', N'qwe')
INSERT [dbo].[Pedidos] ([cod_pedido], [fecha], [direccion]) VALUES (9, N'asd', N'qwe')
INSERT [dbo].[Pedidos] ([cod_pedido], [fecha], [direccion]) VALUES (10, N'14 de febrero', N'viracocha 5147')
INSERT [dbo].[Pedidos] ([cod_pedido], [fecha], [direccion]) VALUES (11, N'12', N'andres maria')
INSERT [dbo].[Pedidos] ([cod_pedido], [fecha], [direccion]) VALUES (12, N'12', N'andres maria')
SET IDENTITY_INSERT [dbo].[Pedidos] OFF
SET IDENTITY_INSERT [dbo].[Productos] ON 

INSERT [dbo].[Productos] ([cod_producto], [Descripcion], [pre_venta], [pre_compra], [unidad_medida], [cantidad]) VALUES (2, N'Sprites', 28, 500, N'1', 20)
INSERT [dbo].[Productos] ([cod_producto], [Descripcion], [pre_venta], [pre_compra], [unidad_medida], [cantidad]) VALUES (3, N'coca cola', 400, 100, N'1', 10)
INSERT [dbo].[Productos] ([cod_producto], [Descripcion], [pre_venta], [pre_compra], [unidad_medida], [cantidad]) VALUES (4, N'pizza', 800, 500, N'3', 10)
SET IDENTITY_INSERT [dbo].[Productos] OFF
SET IDENTITY_INSERT [dbo].[Sueldo] ON 

INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado], [fecha], [estado]) VALUES (28, 10, 40, 2, N'26/06/2018', N'1')
INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado], [fecha], [estado]) VALUES (29, 10, 10, 2, N'26/06/2018', N'1')
INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado], [fecha], [estado]) VALUES (30, 10, 5, 2, N'26/06/2018', N'1')
INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado], [fecha], [estado]) VALUES (33, 10, 10, 2, N'26/06/2018', N'0')
INSERT [dbo].[Sueldo] ([id_sueldo], [cuantoxhora], [horas], [id_empleado], [fecha], [estado]) VALUES (34, 55, 50, 1, N'26/06/2018', N'1')
SET IDENTITY_INSERT [dbo].[Sueldo] OFF
SET IDENTITY_INSERT [dbo].[Ventas] ON 

INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (1, 1, CAST(N'2018-06-12 00:00:00.000' AS DateTime))
INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (2, 1, CAST(N'2018-06-12 00:00:00.000' AS DateTime))
INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (3, 1, CAST(N'2018-06-12 00:00:00.000' AS DateTime))
INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (4, 2, CAST(N'2018-06-12 00:00:00.000' AS DateTime))
INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (5, 2, CAST(N'2018-06-12 00:00:00.000' AS DateTime))
INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (6, 2, CAST(N'2018-06-12 00:00:00.000' AS DateTime))
INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (7, 1, CAST(N'2018-06-12 00:00:00.000' AS DateTime))
INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (8, 1, CAST(N'2018-06-26 00:00:00.000' AS DateTime))
INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (9, 1, CAST(N'2018-06-26 00:00:00.000' AS DateTime))
INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (10, 1, CAST(N'2018-06-26 00:00:00.000' AS DateTime))
INSERT [dbo].[Ventas] ([id_venta], [id_empleado], [fecha_venta]) VALUES (11, 2, CAST(N'2018-06-26 00:00:00.000' AS DateTime))
SET IDENTITY_INSERT [dbo].[Ventas] OFF
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
