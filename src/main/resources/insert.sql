
INSERT INTO t_envanter (envanter_id, envanter_adi,envanter_kodu,envanter_miktar,kritik_miktar,katalog_id) VALUES
	 (-1,'H001','Somun',100,1000,1),
	 (-2,'H002','Vida',400,1000,1),
	 (-3,'Y002','V2 Yarı Mamü',750,200,2),
	 (-4,'Y001','AZ2 Yarı Mamül',500,100,2),	 
	 (-5,'SON1','Kalem',125,100,3),
	 (-6,'SON2','Bike',900,75,3),
	 (-7,'SON3','Mouse',450,50,3);

	 
	 
INSERT INTO users (userid, username,password,enabled) VALUES
	 (1,'Enes','{noop}test123',1),
	 (2,'EK','{noop}test1234',1),
	 (3,'Other','{noop}test12345',1),
	 (4,'Tom','{noop}test123456',1);
	 
	 
INSERT INTO authorities (authorityId, username, authority) VALUES
	 (1,'Enes','ROLE_YETKILI'),
	 (8,'Enes','ROLE_KISITLI'),
	 (2,'EK','ROLE_ADMIN'),
	 (3,'Other','ROLE_KISITLI'),
	 (4,'Tom','ROLE_OTHER'),
	 (5,'EK','ROLE_YETKILI'),
	 (6,'EK','ROLE_KISITLI'),
	 (7,'EK','ROLE_OTHER');
	 