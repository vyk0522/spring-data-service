INSERT INTO session (id,session_name,session_length,session_description)
VALUES (1,'Keynote - The Golden Age of Software',45,''),
       (2,'A Better Way to Access Data with Spring Data',60,''),
       (3,'A Deep Dive Into Spring IoC',60,''),
       (4,'Building RESTful APIs with Spring Data Rest',60,''),
       (5,'Spring Integration Quick Start',60,''),
       (6,'Building Microservices with Spring',60,''),
       (7,'Spring Cloud Primer',60,''),
       (8,'Spring Boot in 30 Minutes',30,''),
       (9,'Testing Spring Applications',30,''),
       (10,'Writing Your First Advice with Spring AOP',30,''),
       (11,'IntelliJ IDEA Tips and Tricks',30,''),
       (12,'Functional Programming in Java',60,''),
       (13,'Making the Switch from Java to Kotlin',60,''),
       (14,'Mastering Concurrency in Java',60,''),
       (15,'Mastering Object-Orientated Programming in Java',60,''),
       (16,'SOLID Principles in Java',60,''),
       (17,'The Most Important Java Design Patterns',60,''),
       (18,'Using EasyMock for Java Testing',30,''),
       (19,'IntelliJ IDEA Debugging Secrets',30,''),
       (20,'Getting Started with Java Flight Recorder',30,''),
       (21,'Clean Code Principls for Java Developers',30,''),
       (22,'Designing Large Scale ASP.NET Core Applications',60,''),
       (23,'Application Security in ASP.NET Core Apps',60,''),
       (24,'.NET''s HttpClient: The Missing Manual',60,''),
       (25,'Using Vue.js in ASP.NET and ASP.NET Core Applications',60,''),
       (27,'Modern Desktop Applications in .NET',60,''),
       (28,'SignalR Quickstart',30,''),
       (29,'Visual Studio Tips and Tricks',30,''),
       (30,'Logging in ASP.NET Core',30,''),
       (31,'A Quick Tour of MiniProfiler',30,''),
       (32,'Demystifying Dependency Injection in .NET',60,''),
       (26,'Clean Code Practices in C#',60,''),
       (33,'Microservices Architectures using ASP.NET Core',60,''),
       (34,'Advanced Techniques in Entity Framework Core',60,''),
       (35,'C# Language Features You May Not Know About',60,''),
       (36,'Asynchronous Programming in .NET',60,''),
       (37,'Advanced Entity Framework Core',60,''),
       (38,'A lap around the .NET Command Line Interface (CLI)',30,''),
       (39,'Deploying .NET Apps with Azure DevOps',30,''),
       (40,'Code Analysis for .NET Projects',30,''),
       (41,'Better Logging with Serilog',30,''),
       (42,'Deploying Web Applications to Azure',60,''),
       (43,'Getting Started with Azure Cognitive Services',60,''),
       (44,'Building Microservices with Azure Functions',60,''),
       (45,'Big Data and Analytics on the Azure Platform',60,''),
       (46,'Getting Started with CosmosDB',60,''),
       (47,'Securing Azure Services',60,''),
       (48,'Azure Event Grid Quickstart',30,''),
       (49,'Managing Azure with the Azure CLI',30,''),
       (50,'Migrating to Azure SQL',30,''),
       (51,'Understanding the Azure Blockchain Service',30,''),
       (62,'Building Hybrid Cloud Architectures in AWS',60,''),
       (63,'Migrating On-Premises Applications to AWS',60,''),
       (64,'IOT Solutions Using AWS',60,''),
       (65,'Getting Startedd with Machine Learning in AWS',60,''),
       (66,'DevOps on the AWS Platform',60,''),
       (67,'Serverless Computing on AWS',60,''),
       (68,'Amazon DynamoDB Quickstart',30,''),
       (69,'Understanding the Amazon Elastic Kubernetes Service',30,''),
       (70,'Creating Your First Data Lake in AWS',30,''),
       (71,'Migrating to Amazon Aurora',30,''),
       (82,'How Agile Are You Really?',60,''),
       (83,'Better Retrospectives',60,''),
       (84,'Developer to Leader',60,''),
       (85,'Selling Your Ideas to Leadership: A Guide for Technology Professionals',60,''),
       (86,'Creating a Culture of Learning',60,''),
       (87,'The Seven Habits of Highly Effective Developers',60,''),
       (88,'Writing Better User Stories',30,''),
       (89,'Techniques for Better Estimates',30,''),
       (90,'Communication Skills for the Technology Professional',30,''),
       (91,'Personal Kanban',30,'');

INSERT INTO speaker (id,first_name,last_name,title,company,speaker_bio,speaker_photo)
VALUES (1,'Sergio','Becker','Senior Developer','MicroOcean Software','Test', null),
       (2,'James','Lowrey','Solutions Architect','Fabrikam Industries','Test', null),
       (3,'Gloria','Franklin','Enerprise Architect','Carved Rock Online','Test', null),
       (4,'Lori','Vanhoose','Java Technical Lead','National Bank','Test', null),
       (5,'Raymond','Hall','Senior Developer','City Power and Electric','Test', null),
       (6,'Sam','Vasquez','Software Analyst','Globalmantics Consulting','Test', null),
       (7,'Justin','Clark','Principal Engineer','Tangerine Hippopotamus Consulting','Test', null),
       (8,'Barbara','Williams','Senior DBA','Contoso','Test', null),
       (9,'James','Sharp','Technical Lead','Adventureworks','Test', null),
       (10,'Julie','Rowe','Software Architect','Northwind Trading','Test', null),
       (11,'Tonya','Burke','Senior Cloud Consultant','Big Data Consulting','Test', null),
       (12,'Nicole','Perry','Engineering Manager','World Wide Importers','Test', null),
       (13,'James','Curtis','Cloud Architect','Farmington Research','Test', null),
       (14,'Patti','White','Program Manager','State Investments','Test', null),
       (15,'Andrew','Graham','Software Architect','Property Insurance Group','Test', null),
       (16,'Lenn','van der Brug','Solutions Architect','Globalmantics Consulting','Test', null),
       (17,'Stephan','Leijtens','Application Development Manager','Bank Europe','Test', null),
       (18,'Anja','Koehler','Software Engineer','Contoso','Test', null),
       (19,'Petra','Holtzmann','Senior API Engineer','European Investment Partners','Test', null),
       (20,'Jens','Lundberg','Consultant','Aqua Sky Consulting','Test', null),
       (21,'Linda','Carver','Senior Developer','Chicago Technology Research','Test', null),
       (22,'Ronald','McMillian','Software Architect','National Bank','Test', null),
       (23,'Dustin','Finn','Software Engineer','Globalmantics Consulting','Test', null),
       (24,'Sharon','Johnson','Solutions Architect','National Aerospace Technologies','Test', null),
       (25,'Karen','McClure','.NET Architect','Adventureworks','Test', null),
       (26,'Matthew','Thompson','Technical Lead','Fabrikam Industries','Test', null),
       (27,'Chris','Moore','Solutions Architect','World Wide Importers','Test', null),
       (28,'Ken','Perry','Software Engineer','International Industrial Works','Test', null),
       (29,'Christie','Fournier','Application Architect','National Software Services','Test', null),
       (30,'Jenny','Lee','Azure Cloud Architect','Prairie Cloud Solutions','Test', null),
       (31,'Alicia','Peng','Senior Cloud Consultant','Cloud Management Partners','Test', null),
       (32,'Page','Reid','Lead Azure Engineer','State Investments','Test', null),
       (33,'Anke','Holzman','Senior AWS Consultant','Cloud Management Partners','Test', null),
       (34,'Dylan','Wilkinson','Principal AWS Engineer','Cloud Native Labs','Test', null),
       (35,'Henry','Duke','Engineering Lead','Wired Brain Coffee','Test', null),
       (36,'Cynthia','Crandall','Senior Business Analyst','Wired Brain Coffee','Test', null),
       (37,'Clara','Dawson','Agile Coach','Agile Coaches Inc','Test', null),
       (38,'Ann','Martinez','Senior AWS Consultant','Western Consulting Services','Test', null),
       (39,'James','King','Staff AWS Engineer','Northern States Bank','Test', null),
       (40,'Simon','Williams','Chief Technology Officer','NorthernSoft Systems','Test', null);
INSERT INTO session_speakers (session_id,speakers_id)
VALUES (1,40),
       (1,1),
       (2,4),
       (3,5),
       (4,1),
       (5,15),
       (6,20),
       (7,21),
       (8,1),
       (9,4),
       (10,20),
       (11,5),
       (12,7),
       (13,23),
       (14,24),
       (15,22),
       (16,21),
       (17,22),
       (18,23),
       (19,7),
       (20,24),
       (21,15),
       (22,2),
       (23,3),
       (24,19),
       (25,25),
       (26,26),
       (27,27),
       (28,25),
       (29,9),
       (30,27),
       (31,16),
       (32,9),
       (33,16),
       (34,28),
       (35,29),
       (36,26),
       (37,28),
       (38,19),
       (39,3),
       (40,2),
       (41,29),
       (42,13),
       (43,30),
       (44,32),
       (45,31),
       (46,8),
       (47,31),
       (48,32),
       (49,13),
       (50,8),
       (51,30),
       (62,34),
       (63,39),
       (64,38),
       (65,33),
       (66,34),
       (67,38),
       (68,33),
       (69,39),
       (70,33),
       (71,33),
       (82,37),
       (83,17),
       (84,17),
       (85,14),
       (86,36),
       (87,35),
       (88,36),
       (89,37),
       (90,14),
       (91,35);

INSERT INTO ticket_type (ticket_type_code,ticket_type_name,description,includes_workshop)
VALUES ('P','Premium','Access to all conference events plus attend the workshop of your choice.',TRUE),
       ('S','Standard','Access to all conference keynotes,sessions,community open spaces and the exhibition hall',FALSE),
       ('C','Community','Access to keynotes,community open spaces and the exhibition hall',FALSE);

INSERT INTO pricing_category (pricing_category_code,pricing_category_name,pricing_start_date,pricing_end_date)
VALUES ('E','Early Bird','2019-12-01','2020-01-15'),
       ('R','Regular','2020-01-16','2020-03-20'),
       ('L','Last Minute','2020-03-21','2020-04-07');

INSERT INTO ticket_price (id,ticket_type_ticket_type_code,pricing_category_pricing_category_code,base_price)
VALUES (1,'P','E',800),
       (2,'P','R',1000),
       (3,'P','L',1200),
       (4,'S','E',500),
       (5,'S','R',700),
       (6,'S','L',1000),
       (7,'C','E',100),
       (8,'C','R',200),
       (9,'C','L',300);
