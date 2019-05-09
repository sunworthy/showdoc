
drop TABLE IF EXISTS `item_sort`;
CREATE TABLE `item_sort`(
	`id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`uid`	int DEFAULT 0,
	`item_sort_data`	VARCHAR(100) NOT NULL DEFAULT '',
	`addtime`	DATETIME DEFAULT now()
);
drop TABLE IF EXISTS `upload_file`;
CREATE TABLE  `upload_file` (
	`file_id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`sign`	VARCHAR(100) NOT NULL DEFAULT '',
	`display_name`	VARCHAR(100) NOT NULL DEFAULT '',
	`file_type`	VARCHAR(100) NOT NULL DEFAULT '',
	`file_size`	VARCHAR(100) NOT NULL DEFAULT '',
	`uid`	INTEGER DEFAULT 0,
	`page_id`	INTEGER DEFAULT 0,
	`item_id`	INTEGER DEFAULT 0,
	`visit_times`	DATETIME DEFAULT now(),
	`addtime`	DATETIME DEFAULT now(),
	`real_url`	VARCHAR(100) NOT NULL DEFAULT '',
	`last_update_time`	DATETIME DEFAULT now()
);


drop TABLE IF EXISTS `team_member`;
CREATE TABLE  `team_member` (
	`id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`team_id`	INTEGER DEFAULT 0,
	`member_uid`	INTEGER DEFAULT 0,
	`member_username`	VARCHAR(100) NOT NULL DEFAULT '',
	`addtime`	DATETIME DEFAULT now(),
	`last_update_time`	DATETIME DEFAULT now()
);
drop TABLE IF EXISTS `team_item_member` ;
CREATE TABLE  `team_item_member` (
	`id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`team_id`	INTEGER DEFAULT 0,
	`item_id`	INTEGER DEFAULT 0,
	`member_group_id`	INTEGER DEFAULT 0,
	`member_uid`	INTEGER DEFAULT 0,
	`member_username`	VARCHAR(100) NOT NULL DEFAULT '',
	`addtime`	DATETIME DEFAULT now(),
	`last_update_time`	DATETIME DEFAULT now()
);


drop TABLE IF EXISTS `team_item`;
CREATE TABLE  `team_item` (
	`id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`team_id`	INTEGER DEFAULT 0,
	`item_id`	INTEGER DEFAULT 0,
	`addtime`	DATETIME DEFAULT now(),
	`last_update_time`	DATETIME DEFAULT now()
);


drop TABLE IF EXISTS `team`;
CREATE TABLE  `team` (
	`id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`team_name`	VARCHAR(100) NOT NULL DEFAULT '',
	`uid`	INTEGER DEFAULT 0,
	`username`	VARCHAR(100) NOT NULL DEFAULT '',
	`addtime`	DATETIME DEFAULT now(),
	`last_update_time`	DATETIME DEFAULT now()
);

drop TABLE IF EXISTS `item_top`;
CREATE TABLE  `item_top` (
	`id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`item_id`	INTEGER DEFAULT 0,
	`uid`	INTEGER DEFAULT 0,
	`addtime`	DATETIME DEFAULT now()
);

drop TABLE IF EXISTS `item_token`;
CREATE TABLE  `item_token` (
	`id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`item_id`	INTEGER DEFAULT 0,
	`api_key`	VARCHAR(100) NOT NULL UNIQUE,
	`api_token`	VARCHAR(100) NOT NULL,
	`addtime`	DATETIME DEFAULT now(),
	`last_check_time`	DATETIME DEFAULT now()
);

DROP TABLE IF EXISTS `options`;
CREATE TABLE  `options` (
	`option_id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`option_name`	VARCHAR(100) NOT NULL UNIQUE,
	`option_value`	VARCHAR(100) NOT NULL
);

drop TABLE IF EXISTS  `template`;
CREATE TABLE  `template` (
	`id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`uid`	INTEGER DEFAULT 0,
	`username`	VARCHAR(100) NOT NULL DEFAULT '',
	`template_title`	VARCHAR(100) NOT NULL DEFAULT '',
	`template_content`	VARCHAR(100) NOT NULL DEFAULT '',
	`addtime`	DATETIME DEFAULT now()
);

drop TABLE IF EXISTS `user_token` ;
CREATE TABLE  `user_token` (
	`id`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`uid`	INTEGER DEFAULT 0,
	`token`	VARCHAR(300) NOT NULL DEFAULT '',
	`token_expire`	INTEGER DEFAULT 0,
	`ip`	VARCHAR(100) NOT NULL DEFAULT '',
	`addtime`	DATETIME DEFAULT now()
);

drop TABLE IF EXISTS `page_history`;
CREATE TABLE  `page_history` (
	`page_history_id`	INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE,
	`page_id`	INTEGER,
	`author_uid`	INTEGER,
	`author_username`	VARCHAR(100),
	`item_id`	INTEGER,
	`cat_id`	INTEGER,
	`page_title`	VARCHAR(300),
	`page_content` MEDIUMTEXT,
	`s_number`	INTEGER,
	`addtime`	DATETIME DEFAULT now(),
	`page_comments`	VARCHAR(100) NOT NULL DEFAULT ''
);

drop TABLE IF EXISTS `page`;
CREATE TABLE  `page` (
	`page_id`	INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE,
	`author_uid`	INTEGER,
	`author_username`	VARCHAR(100),
	`item_id`	INTEGER,
	`cat_id`	INTEGER,
	`page_title`	VARCHAR(300),
	`page_content`	MEDIUMTEXT,
	`s_number`	INTEGER DEFAULT 99,
	`addtime`	DATETIME DEFAULT now(),
	`page_comments`	VARCHAR(100) NOT NULL DEFAULT '',
	`is_del`	INT(1) NOT NULL DEFAULT 0
);

drop TABLE IF EXISTS  `catalog`;
CREATE TABLE  `catalog` (
	`cat_id`	INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE,
	`cat_name`	VARCHAR(100),
	`item_id`	INTEGER,
	`s_number`	INTEGER DEFAULT 99,
	`addtime`	DATETIME DEFAULT now(),
	`parent_cat_id`	INTEGER DEFAULT 0,
	`level`	INTEGER DEFAULT 2
);


drop TABLE IF EXISTS  `user`;
CREATE TABLE  `user` (
	`uid`	INTEGER PRIMARY KEY AUTO_INCREMENT,
	`username`	VARCHAR(100),
	`groupid`	INTEGER DEFAULT 2,
	`name`	VARCHAR(100),
	`avatar`	VARCHAR(100),
	`avatar_small`	VARCHAR(100),
	`email`	VARCHAR(100),
	`password`	VARCHAR(100),
	`cookie_token`	BLOB,
	`cookie_token_expire`	VARCHAR(100) DEFAULT 0,
	`reg_time`	DATETIME DEFAULT now(),
	`last_login_time`	DATETIME DEFAULT now()
);


drop TABLE IF EXISTS `item`;
CREATE TABLE  `item` (
	`item_id`	INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE,
	`item_name`	VARCHAR(100),
	`item_description`	VARCHAR(100),
	`uid`	INTEGER,
	`username`	VARCHAR(100),
	`password`	VARCHAR(100),
	`addtime`	DATETIME DEFAULT now(),
	`last_update_time`	DATETIME DEFAULT now(),
	`item_domain`	VARCHAR(100) NOT NULL DEFAULT '',
	`item_type`	INT(1) NOT NULL DEFAULT 1,
	`is_archived`	INT(1) NOT NULL DEFAULT 0,
	`is_del`	INT(1) NOT NULL DEFAULT 0
);

drop TABLE IF EXISTS `item_member` ;
CREATE TABLE  `item_member` (
	`item_member_id`	INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE,
	`item_id`	INTEGER,
	`uid`	INTEGER,
	`username`	VARCHAR(100),
	`addtime`	DATETIME DEFAULT now(),
	`member_group_id`	INT(1) NOT NULL DEFAULT 1
);


TRUNCATE table `user_token`;
TRUNCATE table `page_history`;
TRUNCATE table `page`;

INSERT INTO `user_token` VALUES (3,1,'e92f1fae0c11b197b4848542634c81c83beaa669408ee201fc5dc66689c92b0f', 3600 ,'127.0.0.1',now());
INSERT INTO `page_history` VALUES (1,1,1,'showdoc',1,1,'register','eNp1U01v2kAQve+vWHFEcR0oRS3nHiu1atoztsAilhKMbKNEqisBSmgrKFCJRgSqqGkoyaHCiUIaNbj1n2F37RN/oWOv+VDUrmVp582b2X16swjDQvE4G1e8UZW22557OXf68ThGSMCse0Hf39LrC1Jv0tZ30j5DwPXsW3pVe/3yWUQUsIS3TbOUEcX9/Qc5bVeUS6pYNhRd1JWCapiKjiUUHsNL6dEv4rTDaih+8XzrFQ76knaNfl6ebvGQdD5axD30Kx8sdjUlJw3Lsye017KQlRFgBfcPdzwUsCVEMDCCOxTlXQVbtGcDYpi6Wixgi+uC1pxWkg1jT9Pz92mY2HX2tYo5K2wU7klntM6ivRt2fslZCINIt0sGJ2x4N/vTAIVIkiQM8t+ggBJTdF3Tszktr8QyeHODg3nZlCHkFIjLah7CWCK2sUQiKSGcTDxKwbfKLjKkM2HXU9qsrVIFXSuXwnZJvATBl6ypRt1SD9OP06lE+smqaEc2zOyOVlCLS9pmlH2Lgh80rWnlVnFj7pv3T9eEyDSwbWHX/xaURBKwpRbNAOH2semBmp87zQRMjPfzkN2ds/Ep69TJp97cGSQBpcdjv9Ln7IU5ZPgO5jmabzqYkGGfa/C7x55tz6Zn4DiMKfvS8EdH/ukN6x+sp/gTQQjRH988tzX77UL/rW1t76mWmzvVvzM7X7w=',99,now(),'');
INSERT INTO `page_history` VALUES (2,1,1,'showdoc',1,1,'register','eNrtVV1rGkEUfZ9fMfgo2W60Vlqf+1hoadpnXdzFLCSu7K4k0A2oJLZF6xqwwWgJ+bAmD8VNiGlotPXPODPrk3+hd3fWD0L72oeSGVjmnnvunTksnIswLBQOs17B7Rapbbujy+mwFQ5jhATMGhf0wy29viDlKq19JfYZAq7r3NKr0tvXLwKigFN43TRzCVHc3n6U1jZFKaeKeUPRRV3JqIap6DiF/Gt4KT34QYa2Xw3Fr16uvcFeX2KX6Of57RYPSf2TRUZ7k8JHi10NyFHFcp0+bdYsZCUEWN77/RMPBWwJAQwM7w1ZaVPBFm06gBimrmYz2OK6oDWn5STD2NJ0+T4NE6fMjouYs/xG/pnUu8ss2rxh55echTCIHDVI+4h17sa/KqAQpVIpDPLfIY8SUnRd05NpTVZCCby6wkFZMiUIOQXivCpDGIqEVuZIIMWHo5EnMdiL7CxD6n12PaDV0iKV0bV8zm8XxXMQ/kvSVINuscfxp/FYJP5sUbQhGWZyQ8uo2TltNcjuwHeHH/8nRQ+CHgT9a0FgDEuGwf2Ou9t9B/yj9QmB84H3zTzvbwtKAgnYUrOmh3APZINdVZ4OqxGwXff7Hrs7Z70TVi+T/eZ02I4CSg97k0KLs2cORzrvYSgEQ4K2+6TT4homjUPXccaDM7BN8Hr2pTLpHkxOblhrdznF5wxCiH47dUe18c8R9F9b17aea+npsPgbr7gwUw==',99,now(),'');
INSERT INTO `page` VALUES (1,1,'showdoc',1,1,'register','

**简要描述：**

- 用户注册接口

**请求URL：**
- ` http://xx.com/api/user/register `

**请求方式：**
- POST

**参数：**

|参数名|必选|类型|说明|
|:----    |:---|:----- |-----   |
|username |是  |string |用户名   |
|password |是  |string | 密码    |
|name     |否  |string | 昵称    |

 **返回示例**

```
  {
    `error_code`: 0,
    `data`: {
      `uid`: `1`,
      `username`: `12154545`,
      `name`: `吴系挂`,
      `groupid`: 2 ,
      `reg_time`: `1436864169`,
      `last_login_time`: `0`,
    }
  },
    {
    `error_code`: 0,
    `data`: {
      `uid`: `1`,
      `username`: `12154545`,
      `name`: `吴系挂`,
      `groupid`: 2 ,
      `reg_time`: `1436864169`,
      `last_login_time`: `0`,
    }
  }
    {
    `error_code`: 0,
    `data`: {
      `uid`: `1`,
      `username`: `12154545`,
      `name`: `吴系挂`,
      `groupid`: 2 ,
      `reg_time`: `1436864169`,
      `last_login_time`: `0`,
    }
  }
    {
    `error_code`: 0,
    `data`: {
      `uid`: `1`,
      `username`: `12154545`,
      `name`: `吴系挂`,
      `groupid`: 2 ,
      `reg_time`: `1436864169`,
      `last_login_time`: `0`,
    }
  }
    {
    `error_code`: 0,
    `data`: {
      `uid`: `1`,
      `username`: `12154545`,
      `name`: `吴系挂`,
      `groupid`: 2 ,
      `reg_time`: `1436864169`,
      `last_login_time`: `0`,
    }
  }
```

 **返回参数说明**

|参数名|类型|说明|
|:-----  |:-----|-----                           |
|groupid |int   |用户组id，1：超级管理员；2：普通用户  |

 **备注**

- 更多返回错误代码请看首页的错误代码描述


欢迎使用ShowDoc！',99,now(),'',0);


TRUNCATE TABLE `catalog`;
TRUNCATE TABLE `user`;
TRUNCATE TABLE `item`;
INSERT INTO `catalog` VALUES (1,'user',1,99,now(),0,2);
INSERT INTO `catalog` VALUES (2,'setting',1,99,now(),0,2);
INSERT INTO `user` VALUES (1,'showdoc',1,NULL,NULL,NULL,NULL,'a89da13684490eb9ec9e613f91d24d00',NULL,0,now(),now());
INSERT INTO `item` VALUES (1,'hello-api','hello-api',1,'showdoc','',now(),now(),'',1,0,0);
COMMIT;
