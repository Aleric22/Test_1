SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE `Like_List` (
    `SN` varchar(20) NOT NULL AUTO_INCREMENT,
    `Order_Name` int NOT NULL,
    `Account` varchar(20) NOT NULL,
    `Total_Fee` varchar(20) NOT NULL,
    `Total_Amount` varchar(20) NOT NULL,
    PRIMARY KEY (`SN`)
) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO