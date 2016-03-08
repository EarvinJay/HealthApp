BEGIN TRANSACTION;
CREATE TABLE "Foods" (
	`FOOD_ID`	INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE,
	`FOOD_NAME`	TEXT UNIQUE,
	`FOOD_TYPE`	TEXT,
	`TYPE_O`	TEXT,
	`TYPE_A`	TEXT,
	`TYPE_B`	TEXT,
	`TYPE_AB`	TEXT
);
INSERT INTO `Foods` VALUES (1,'Banana
','FRUIT','Unknown','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (2,'Orange
','FRUIT','Unknown','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (3,'Tomato','FRUIT
','Neutral','Avoided','Avoided','Neutral');
INSERT INTO `Foods` VALUES (4,'Cranberries','FRUIT
','Neutral','Neutral','Allowed','Allowed');
INSERT INTO `Foods` VALUES (5,'Grapes','FRUIT','Neutral','Neutral','Allowed','Allowed');
INSERT INTO `Foods` VALUES (6,'Papaya','FRUIT','Neutral','Avoided','Allowed','Neutral');
INSERT INTO `Foods` VALUES (7,'Pineapple

','FRUIT','Neutral','Allowed','Allowed','Neutral');
INSERT INTO `Foods` VALUES (8,'Plum','FRUIT','Allowed','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (9,'Raisin','FRUIT','Neutral','Neutral','Unknown','Neutral');
INSERT INTO `Foods` VALUES (10,'Apple
','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (11,'Appricot','FRUIT','Neutral','Allowed','Neutral','Neutral');
INSERT INTO `Foods` VALUES (12,'Blackcurrant
','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (13,'Blueberry','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (14,'Cherry','FRUIT','Neutral','Allowed','Neutral','Allowed');
INSERT INTO `Foods` VALUES (15,'Dates','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (16,'Figs
','FRUIT','Allowed','Allowed','Neutral','Allowed');
INSERT INTO `Foods` VALUES (17,'Grapefruit
','FRUIT','Neutral','Allowed','Neutral','Neutral');
INSERT INTO `Foods` VALUES (18,'Guava
','FRUIT','Neutral','Neutral','Neutral','Avoided');
INSERT INTO `Foods` VALUES (19,'Kiwi
','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (20,'Lemon','FRUIT','Neutral','Allowed','Neutral','Neutral');
INSERT INTO `Foods` VALUES (21,'Lime
','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (22,'Lychee
','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (23,'Mango','FRUIT','Neutral','Avoided','Neutral','Avoided');
INSERT INTO `Foods` VALUES (24,'Melon','FRUIT','Avoided','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (25,'Watermelon','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (26,'Nectarine','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (27,'Peach','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (28,'Orange','FRUIT','Avoided','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (29,'Pear
','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (30,'Prune','FRUIT','Allowed','Allowed','Neutral','Neutral');
INSERT INTO `Foods` VALUES (31,'Raspberry
','FRUIT','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (32,'Strawberry','FRUIT','Avoided','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (33,'Coconut','FRUIT','Avoided','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (34,'Persimon','FRUIT','Neutral','Neutral','Avoided','Avoided');
INSERT INTO `Foods` VALUES (35,'Starfruit','FRUIT','Neutral','Neutral','Avoided','Avoided');
INSERT INTO `Foods` VALUES (36,'Broccoli','VEGETABLE AND SPROUTS
','Allowed','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (37,'Avocado','VEGETABLE AND SPROUTS','Avoided','Neutral','Limited','Limited');
INSERT INTO `Foods` VALUES (38,'Brussels','VEGETABLE AND SPROUTS','Unknown','Unknown','Allowed','Avoided');
INSERT INTO `Foods` VALUES (39,'Broad Beans','VEGETABLE AND SPROUTS','Unknown','Avoided','Allowed','Avoided');
INSERT INTO `Foods` VALUES (40,'Cabbage','VEGETABLE AND SPROUTS','Avoided','Avoided','Allowed','Neutral');
INSERT INTO `Foods` VALUES (41,'Cauliflower','VEGETABLE AND SPROUTS','Avoided','Neutral','Allowed','Allowed');
INSERT INTO `Foods` VALUES (42,'Garlic','VEGETABLE AND SPROUTS','Allowed','Allowed','Neutral','Allowed');
INSERT INTO `Foods` VALUES (43,'Leeks','VEGETABLE AND SPROUTS','Allowed','Unknown','Neutral','Neutral');
INSERT INTO `Foods` VALUES (44,'Okra','VEGETABLE AND SPROUTS','Allowed','Allowed','Neutral','Neutral');
INSERT INTO `Foods` VALUES (45,'Onions','VEGETABLE AND SPROUTS','Allowed','Allowed','Neutral','Neutral');
INSERT INTO `Foods` VALUES (46,'Parsely','VEGETABLE AND SPROUTS','Allowed','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (47,'Chilli Pepper','VEGETABLE AND SPROUTS','Neutral','Avoided','Neutral','Avoided');
INSERT INTO `Foods` VALUES (48,'Red Pepper','VEGETABLE AND SPROUTS','Allowed','Avoided','Allowed','Avoided');
INSERT INTO `Foods` VALUES (49,'Green Pepper','VEGETABLE AND SPROUTS','Neutral','Avoided','Allowed','Avoided');
INSERT INTO `Foods` VALUES (50,'Yellow Pepper','VEGETABLE AND SPROUTS','Neutral','Avoided','Allowed','Avoided');
INSERT INTO `Foods` VALUES (51,'Pumpkin','VEGETABLE AND SPROUTS','Allowed','Allowed','Avoided','Neutral');
INSERT INTO `Foods` VALUES (52,'Spinach','VEGETABLE AND SPROUTS','Allowed','Allowed','Neutral','Neutral');
INSERT INTO `Foods` VALUES (53,'Sweet Potato','VEGETABLE AND SPROUTS','Allowed','Avoided','Allowed','Allowed');
INSERT INTO `Foods` VALUES (54,'Red Potato','VEGETABLE AND SPROUTS','Avoided','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (55,'White Potato','VEGETABLE AND SPROUTS','Avoided','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (56,'Tapioca','VEGETABLE AND SPROUTS','Allowed','Unkwon','Unkwon','Unkwon');
INSERT INTO `Foods` VALUES (57,'Asaparagus','VEGETABLE AND SPROUTS','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (58,'Bamboo Shoots','VEGETABLE AND SPROUTS','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (59,'Carrots','VEGETABLE AND SPROUTS','Neutral','Neutral','Allowed','Neutral');
INSERT INTO `Foods` VALUES (60,'Celery','VEGETABLE AND SPROUTS','Neutral','Neutral','Neutral','Allowed');
INSERT INTO `Foods` VALUES (61,'Coriander','VEGETABLE AND SPROUTS','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (62,'Cucumber','VEGETABLE AND SPROUTS','Neutral','Neutral','Neutral','Allowed');
INSERT INTO `Foods` VALUES (63,'Ginger','VEGETABLE AND SPROUTS','Neutral','Allowed','Neutral','Neutral');
INSERT INTO `Foods` VALUES (64,'Lettuce','VEGETABLE AND SPROUTS','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (65,'Cultivated Mushroom','VEGETABLE AND SPROUTS','Avoided','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (66,'Tofu','VEGETABLE AND SPROUTS','Neutral','Allowed','Avoided','Allowed');
INSERT INTO `Foods` VALUES (67,'Yam','VEGETABLE AND SPROUTS','Neutral','Avoided','Allowed','Allowed');
INSERT INTO `Foods` VALUES (68,'Sweet Corn','VEGETABLE AND SPROUTS','Avoided','Neutral','Avoided','Avoided');
INSERT INTO `Foods` VALUES (69,'Mung Bean Sprout','VEGETABLE AND SPROUTS','Neutral','Neutral','Avoided','Avoided');
INSERT INTO `Foods` VALUES (70,'Bak Choy','VEGETABLE AND SPROUTS','Unknown','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (71,'Beet Root','VEGETABLE AND SPROUTS','Neutral','Neutral','Allowed','Allowed');
INSERT INTO `Foods` VALUES (72,'Water Chestnut','VEGETABLE AND SPROUTS
','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (73,'Bacon','MEAT
','Avoided','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (74,'Beef','MEAT','Allowed','Avoided','Neutral','Avoided');
INSERT INTO `Foods` VALUES (75,'Chicken','MEAT','Neutral','Neutral','Avoided','Avoided');
INSERT INTO `Foods` VALUES (76,'Duck','MEAT','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (77,'Goose','MEAT','Avoided','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (78,'Ham','MEAT','Avoided','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (79,'Lamb','MEAT','Allowed','Avoided','Allowed','Allowed');
INSERT INTO `Foods` VALUES (80,'Pork','MEAT','Unknwon','Unknwon','Unknwon','Unknwon');
INSERT INTO `Foods` VALUES (81,'Quail','MEAT','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (82,'Rabbit','MEAT','Neutral','Avoided','Allowed','Allowed');
INSERT INTO `Foods` VALUES (83,'Turkey','MEAT','Neutral','Neutral','Neutral','Allowed');
INSERT INTO `Foods` VALUES (84,'Veal','MEAT','Allowed','Avoided','Neutral','Avoided');
INSERT INTO `Foods` VALUES (85,'Almonds','NUTS AND SEEDS','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (86,'Chestnut','NUTS AND SEEDS','Neutral','Neutral','Neutral','Allowed');
INSERT INTO `Foods` VALUES (87,'Hazelnut','NUTS AND SEEDS','Neutral','Neutral','Avoided','Avoided');
INSERT INTO `Foods` VALUES (88,'Macadamia Nut','NUTS AND SEEDS','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (89,'Sesame Seeds','NUTS AND SEEDS','Neutral','Neutral','Avoided','Avoided');
INSERT INTO `Foods` VALUES (90,'Cashew Nut','NUTS AND SEEDS','Avoided','Avoided','Avoided','Neutral');
INSERT INTO `Foods` VALUES (91,'Peanuts','NUTS AND SEEDS','Avoided','Allowed','Avoided','Allowed');
INSERT INTO `Foods` VALUES (92,'Pumpkin Seeds','NUTS AND SEEDS','Allowed','Allowed','Unknown','Avoided');
INSERT INTO `Foods` VALUES (93,'Brazil Nut','NUTS AND SEEDS','Avoided','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (94,'Walnut','NUTS AND SEEDS','Allowed','Neutral','Neutral','Allowed');
INSERT INTO `Foods` VALUES (95,'Black-eyed-beans','BEANS','Allowed','Allowed','Avoided','Avoided');
INSERT INTO `Foods` VALUES (96,'Black Beans','BEANS','Neutral','Allowed','Avoided','Avoided');
INSERT INTO `Foods` VALUES (97,'Chick Peas','BEANS','Neutral','Avoided','Avoided','Neutral');
INSERT INTO `Foods` VALUES (98,'Green Peas','BEANS','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (99,'Kidney Beans','BEANS','Avoided','Avoided','Allowed','Avoided');
INSERT INTO `Foods` VALUES (100,'Soya Beans','BEANS','Avoided','Unknown','Unknown','Allowed');
INSERT INTO `Foods` VALUES (101,'Red Soya','BEANS','Unknown','Allowed','Neutral','Allowed');
INSERT INTO `Foods` VALUES (102,'Red Bran','BEANS','Unknown','Allowed','Neutral','Allowed');
INSERT INTO `Foods` VALUES (103,'Sugar-snap Bran
','BEANS','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (104,'Peas','BEANS','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (105,'Other Beans','BEANS','Limited','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (106,'Other Legumes','BEANS','Limited','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (107,'Barley','GRAINS/CERIAL','Neutral','Neutral','Avoided','Neutral');
INSERT INTO `Foods` VALUES (108,'Oats','GRAINS/CERIAL','Neutral','Neutral','Allowed','Allowed');
INSERT INTO `Foods` VALUES (109,'Rice','GRAINS/CERIAL','Limited','Neutral','Allowed','Allowed');
INSERT INTO `Foods` VALUES (110,'Corn','GRAINS/CERIAL','Avoided','Neutral','Avoided','Avoided');
INSERT INTO `Foods` VALUES (111,'Wheat Bran','GRAINS/CERIAL','Avoided','Avoided','Avoided','Neutral');
INSERT INTO `Foods` VALUES (112,'Wheat Germ','GRAINS/CERIAL','Avoided','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (113,'Buck Wheat','GRAINS/CERIAL','Neutral','Allowed','Avoided','Avoided');
INSERT INTO `Foods` VALUES (114,'Abalone','SEAFOOD','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (115,'Anchovy','SEAFOOD','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (116,'Carp','SEAFOOD','Neutral','Allowed','Neutral','Neutral');
INSERT INTO `Foods` VALUES (117,'Catfish','SEAFOOD','Avoided','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (118,'Clam','SEAFOOD','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (119,'Cod','SEAFOOD','Allowed','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (120,'Crab','SEAFOOD','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (121,'Crayfish','SEAFOOD','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (122,'Eel','SEAFOOD','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (123,'Frogs','SEAFOOD','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (124,'Grouper','SEAFOOD','Neutral','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (125,'Haddock','SEAFOOD','Neutral','Avoided','Neutral','Avoided');
INSERT INTO `Foods` VALUES (126,'Herring','SEAFOOD','Neutral','Avoided','Neutral','Avoided');
INSERT INTO `Foods` VALUES (127,'Kelp','SEAFOOD','Unknown','Unknown','Unknown','Allowed');
INSERT INTO `Foods` VALUES (128,'Lobster','SEAFOOD','Allowed','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (129,'Mackerel','SEAFOOD','Allowed','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (130,'Mussels','SEAFOOD','Neutral','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (131,'Octopus','SEAFOOD','Avoided','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (132,'Oysters','SEAFOOD','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (133,'Salmon','SEAFOOD','Allowed','Allowed','Neutral','Allowed');
INSERT INTO `Foods` VALUES (134,'Seaweeds','SEAFOOD','Allowed','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (135,'Smoked Salmon','SEAFOOD','Avoided','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (136,'Sardines','SEAFOOD','Allowed','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (137,'Scallop','SEAFOOD','Neutral','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (138,'Sea Bass','SEAFOOD','Neutral','Neutral','Avoided','Avoided');
INSERT INTO `Foods` VALUES (139,' Shark','SEAFOOD','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (140,'Shrimp','SEAFOOD','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (141,'Snapper','SEAFOOD','Allowed','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (142,'Sole','SEAFOOD','Avoided','Avoided','Neutral','Avoided');
INSERT INTO `Foods` VALUES (143,'Squid','SEAFOOD','Neutral','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (144,'Swordfish','SEAFOOD','Allowed','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (145,'Trout','SEAFOOD','Neutral','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (146,'Tuna','SEAFOOD','Neutral','Neutral','Neutral','Allowed');
INSERT INTO `Foods` VALUES (147,'Egg','OTHERS','Neutral','Neutral','Allowed','Allowed');
INSERT INTO `Foods` VALUES (148,'Soya Milk','OTHERS','Neutral','Allowed','Neutral','Neutral');
INSERT INTO `Foods` VALUES (149,'Whole Milk','OTHERS','Unknown','Avoided','Neutral','Unknown');
INSERT INTO `Foods` VALUES (150,'Skimmed Milk','OTHERS','Avoided','Avoided','Allowed','Neutral');
INSERT INTO `Foods` VALUES (151,'Goat Milk','OTHERS','Avoided','Neutral','Allowed','Allowed');
INSERT INTO `Foods` VALUES (152,'Yogurt','OTHERS','Avoided','Neutral','Allowed','Neutral');
INSERT INTO `Foods` VALUES (153,'Butter','OTHERS','Neutral','Avoided','Neutral','Avoided');
INSERT INTO `Foods` VALUES (154,'Cottage Cheese','OTHERS','Avoided','Avoided','Allowed','Allowed');
INSERT INTO `Foods` VALUES (155,'Cheddar Cheese','OTHERS','Avoided','Avoided','Neutral','Neutral');
INSERT INTO `Foods` VALUES (156,'Mozarella Cheese','OTHERS','Allowed','Neutral','Allowed','Allowed');
INSERT INTO `Foods` VALUES (157,'Ice Cream','OTHERS','Avoided','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (158,'Olive Oil','OILS AND FATS','Allowed','Allowed','Allowed','Allowed');
INSERT INTO `Foods` VALUES (159,'Cod Liver Oil','OILS AND FATS','Neutral','Neutral','Neutral','Neutral');
INSERT INTO `Foods` VALUES (160,'Sesame Oil','OILS AND FATS','Neutral','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (161,'Corn Oil','OILS AND FATS','Avoided','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (162,'Groundnut Oil','OILS AND FATS','Avoided','Avoided','Avoided','Neutral');
INSERT INTO `Foods` VALUES (163,'Safflower Oil','OILS AND FATS','Avoided','Avoided','Avoided','Avoided');
INSERT INTO `Foods` VALUES (164,'Sunflower Oil','OILS AND FATS','Unknown','Neutral','Avoided','Avoided');
INSERT INTO `Foods` VALUES (165,'Canola Oil','OILS AND FATS','Neutral','Neutral','Avoided','Neutral');
INSERT INTO `Foods` VALUES (166,'Sunflower Seeds','NUTS AND SEEDS','Neutral','Neutral','Avoided','Avoided');
COMMIT;
