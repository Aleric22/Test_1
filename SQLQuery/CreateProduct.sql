SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE `Product` (
    `No` varchar(20) NOT NULL AUTO_INCREMENT,
    `Product_Name` varchar(20) NOT NULL,
    `Price` varchar(20) NOT NULL,
    `Fee_Rate` varchar(20) NOT NULL,
    PRIMARY KEY (`No`)
) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO