# Electricity Billing System

The Electricity Billing System is a Java-based application that allows users to manage customer details, generate bills, and handle payments for electricity consumption. The system provides a graphical user interface (GUI) for a seamless user experience.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)
-

## Features

1. **Customer Details:** View and manage customer information.
2. **Generate Bill:** Automatically generate electricity bills based on meter readings.
3. **Deposit Details:** View details of deposits made by customers.
4. **Pay Bill:** Process payments and update the bill status.
5. **View Information:** Display customer information for reference.

## Prerequisites

- Java Development Kit (JDK) installed
- MySQL Database

## Installation

Set up the MySQL database by executing the provided SQL script.

mysql -u your-username -p < database_script.sql

Configure the database connection parameters in the Conn class.


## Usage


1. Run the application.

2. Navigate through the GUI to access different functionalities.
   
3. Ensure that the MySQL server is running and the database connection is established.

## Project Structure

src/: Contains the Java source code files.

electricity/billing/system/: Package for project classes.

database_script.sql: SQL script to create the required database and tables.

## Dependencies

Java Swing: GUI components for the graphical interface.

MySQL Connector/J: JDBC driver for MySQL database connectivity.

NetBeans (or any preferred Java IDE): Project is built using NetBeans.



