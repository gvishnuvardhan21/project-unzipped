drop database if exists TransportManagementSystem;

create database TransportManagementSystem;

use TransportManagementSystem;


create table vehicles 
( 
vehicleid int auto_increment primary key, 
model varchar(255), 
capacity decimal(10, 2), 
type varchar(50), 
status varchar(50),
fuel_type varchar(50)
);


create table Routes
(
RouteID int primary key auto_increment,
StartDestination varchar(255),
EndDestination varchar(255),
Distance decimal(10,2),
Availability varchar(20)
);


create table Trips (
    Trip_ID int auto_increment primary key,
    VehicleID int,
    RouteID int,
    DepartureDate datetime,
    ArrivalDate datetime,
    Trip_Status varchar(50),
    Trip_Type varchar(50) default 'Freight',
    MaxPassengers int,
    DriverId int,
    foreign key (VehicleID) references Vehicles(VehicleID) on delete cascade,
    foreign key (RouteID) references Routes(RouteID) on delete cascade
);


create table Passengers(
	PassengerID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(255),
    Gender VARCHAR(255),
    Age INT,
    Email VARCHAR(255) UNIQUE,
    PhoneNumber VARCHAR(50)
);

drop table bookings;

CREATE TABLE Bookings (
    BookingID INT AUTO_INCREMENT PRIMARY KEY,
    Trip_ID INT,
    PassengerID INT,
    BookingDate DATETIME,
    Status VARCHAR(50),
    FOREIGN KEY (Trip_ID) REFERENCES Trips(Trip_ID)on delete cascade,
    FOREIGN KEY (PassengerID) REFERENCES Passengers(PassengerID)on delete cascade
);

drop table driver;

create table Driver(
Driverid int auto_increment primary key,
DriverName varchar(30),
phoneNo bigint,
DriverStatus varchar(30),
Tripid int,
vehicleid int,
FOREIGN KEY (TripID) REFERENCES Trips(Trip_ID)on delete cascade,
FOREIGN KEY (vehicleid) REFERENCES vehicles(vehicleid)on delete cascade
);


