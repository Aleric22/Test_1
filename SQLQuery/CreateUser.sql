SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE `User` (
    `User_ID` varchar(20) NOT NULL,
    `User_Name` varchar(20) NOT NULL,
    `Email` varchar(20) NOT NULL,
    `Account` varchar(20) NOT NULL,
    PRIMARY KEY (`User_ID`)
) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO