CREATE TABLE `javabook`.`department` (
  `deptId` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `chairId` NVARCHAR(11) NULL,
  `facultyId` INT NULL,
  PRIMARY KEY (`deptId`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC));
  
CREATE TABLE `javabook`.`student` (
  `studentId` NVARCHAR(11) NOT NULL,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `birthDate` DATE NULL,
  `address` VARCHAR(100) NULL,
  `deptId` INT NULL,
  PRIMARY KEY (`studentId`),
  FOREIGN KEY (`deptId`) REFERENCES `javabook`.`department`(`deptId`));

  CREATE TABLE `javabook`.`course` (
  `courseId` INT NOT NULL,
  `code` VARCHAR(10) NULL,
  `title` VARCHAR(50) NOT NULL,
  `numOfCredits` INT NOT NULL,
  PRIMARY KEY (`courseId`));

  CREATE TABLE `javabook`.`enrollment` (
  `studentId` NVARCHAR(11) NOT NULL,
  `courseId` INT NOT NULL,
  `dateRegistered` DATE NULL,
  `grade` VARCHAR(2) NULL,
  PRIMARY KEY (`studentId`, `courseId`));
  
  CREATE TABLE `javabook`.`instructor` (
  `instructorId` NVARCHAR(11) NOT NULL,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `office` VARCHAR(45) NULL,
  `deptId` INT NULL,
  PRIMARY KEY (`instructorId`));
  
  CREATE TABLE `javabook`.`faculty` (
  `facultyId` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`facultyId`));
  
  CREATE TABLE `javabook`.`taughtby` (
  `courseId` INT NOT NULL,
  `instructorId` NVARCHAR(11) NOT NULL,
  `term` VARCHAR(10) NULL,
  `year` YEAR(4) NULL);
  
insert into department (name, chairId, facultyId) values ( 'Computer Engineering', '11122233312', '1');
insert into department (name, chairId, facultyId) values ( 'Electrical Engineering', '11122244412', '1');

INSERT INTO `javabook`.`instructor` (`instructorId`, `firstName`, `lastName`, `office`, `deptId`) VALUES ('11122233312', 'Ali', 'Kaya', 'A2 201', '1');
INSERT INTO `javabook`.`instructor` (`instructorId`, `firstName`, `lastName`, `office`, `deptId`) VALUES ('11122244412', 'Metin', 'Kurt', 'A1 102', '2');
INSERT INTO `javabook`.`instructor` (`instructorId`, `firstName`, `lastName`, `office`, `deptId`) VALUES ('11122255512', 'Mehmet', 'Demir', 'A1 103', '2');
INSERT INTO `javabook`.`instructor` (`instructorId`, `firstName`, `lastName`, `office`, `deptId`) VALUES ('11122266612', 'Bilge', 'Budun', 'A2 202', '1');

INSERT INTO `javabook`.`student` (`studentId`, `firstName`, `lastName`, `birthDate`, `address`, `deptId`) VALUES ('1111', 'Ayse', 'Sebe', '1998-10-10', 'Kayseri', '1');
INSERT INTO `javabook`.`student` (`studentId`, `firstName`, `lastName`, `birthDate`, `address`, `deptId`) VALUES ('1112', 'Yunus', 'Eren', '1997-10-10', 'Kayseri', '1');
INSERT INTO `javabook`.`student` (`studentId`, `firstName`, `lastName`, `birthDate`, `address`, `deptId`) VALUES ('1113', 'Elif', 'Kara', '1998-12-12', 'Antalya', '1');
INSERT INTO `javabook`.`student` (`studentId`, `firstName`, `lastName`, `birthDate`, `address`, `deptId`) VALUES ('1114', 'Emir', 'Turan', '1999-10-10', 'Erzurum', '1');


INSERT INTO `javabook`.`course` (`courseId`, `code`, `title`, `numOfCredits`) VALUES ('1','BZ 214', 'Visual Programming', '6');
INSERT INTO `javabook`.`course` (`courseId`,`code`, `title`, `numOfCredits`) VALUES ('2','BZ 209', 'Object Oriented Programming', '7');
INSERT INTO `javabook`.`course` (`courseId`,`code`, `title`, `numOfCredits`) VALUES ('3','BZ 205', 'Data Structures and Algorithms', '7');
INSERT INTO `javabook`.`course` (`courseId`,`code`, `title`, `numOfCredits`) VALUES ('4','BZ 101', 'Calculus I', '6');
INSERT INTO `javabook`.`course` (`courseId`,`code`, `title`, `numOfCredits`) VALUES ('5','BZ 108', 'Calculus II', '6');
INSERT INTO `javabook`.`course` (`courseId`,`code`, `title`, `numOfCredits`) VALUES ('6','BZ 310', 'Database Management Systems', '5');

INSERT INTO `javabook`.`faculty` (`facultyId`, `name`) VALUES ('1', 'Engineering Faculty');


insert into enrollment values ('1111', '1', CURDATE(), 'AA');
insert into enrollment values ('1111', '2', CURDATE(), 'BA');
insert into enrollment values ('1111', '3', CURDATE(), 'CC');
insert into enrollment values ('1111', '4', CURDATE(), 'CC');

insert into enrollment values ('1112', '1', CURDATE(), 'FF');
insert into enrollment values ('1112', '2', CURDATE(), 'BA');
insert into enrollment values ('1112', '3', CURDATE(), 'CC');
insert into enrollment values ('1112', '4', CURDATE(), 'CC');

insert into enrollment values ('1113', '1', CURDATE(), 'AA');
insert into enrollment values ('1113', '2', CURDATE(), 'AA');
insert into enrollment values ('1113', '3', CURDATE(), 'AA');
insert into enrollment values ('1113', '4', CURDATE(), 'AA');

insert into enrollment values ('1114', '1', CURDATE(), 'CC');
insert into enrollment values ('1114', '2', CURDATE(), 'FF');
insert into enrollment values ('1114', '3', CURDATE(), 'FF');
insert into enrollment values ('1114', '4', CURDATE(), 'FD');

insert into taughtby values ('1', '11122233312', 'spring', '2018');
insert into taughtby values ('2', '11122244412', 'spring', '2018');
insert into taughtby values ('3', '11122255512', 'spring', '2018');
insert into taughtby values ('4', '11122266612', 'spring', '2018');

CREATE PROCEDURE `find_grade` (IN id NVARCHAR(11), IN course_id INT)
BEGIN
	SELECT firstName, lastName, title, grade FROM student 
    INNER JOIN enrollment ON student.studentId = enrollment.studentId 
    INNER JOIN course ON enrollment.courseId = course.courseId 
    WHERE student.studentId = id and  enrollment.courseId = course_id ;
END

