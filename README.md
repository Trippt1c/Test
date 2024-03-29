  

#          A PROMise for Yates


> This should and will be updated according to new changes and client requests/corrections

#                Overview


> Yates needs help organizing prom given how chaotic it is. He has spreadsheets with tons of data and we need to organize it into tables.


##              Description


**Client:**     Taylor Yates

**Due Date:**   December 19, 2019

**Team:**      
* Dylan Trang
* Long Tran
* David Quinten Sustaita-Robb
* Minh Nguyen

**Language:**   Java

## Actions Client will take:
1. Run script (.bat file) to open program
2. Submit 2 Excel Spreadsheets in CSV form via the GUI submitter
3. Be able to search for Student, Group, and Table info (details below)
4. Record resulting Table data however they choose
5. Scan QR codes on tickets to confirm entry into prom


##                Input

* Excel Spreadsheet (CSV) with Student Name, ID, Group, and Ticket #
* Excel spreadsheet (CSV) with Student Groupings
     Submission via GUI


##                Output

* Tables of 10 with groups in them
* A GUI able to search for certain Tables, Students, and Groups and pull up information
    * for Students search by ID and return Table, Group, Name, and Ticket ID
    * for Tables return Groups and Table ID
    * for Groups return Student IDs, Students, and Table

=======================================
 #           Notes/Guidelines


* Tables can hold up to 10 people

* Groups can be from 1-10 people

* Talk to Yates about ticket IDs and QR codes

* Implement Database?
    * Entails server costs and vulnerabilities
    * Can just write JSON file to Yate's computer
    * Local database? may be too complicated to setup each time

* **May need to make separate app to scan QR codes and make sure no dupes/fakes are made**
    * Phone app/webcam?

* Make it easy on user (Yates), only has to upload 2 files with a clean UI and only has to run one file
    * Quinten make Java Swing GUI
    * Dylan make Batch script to run everything
    * Make it S.I.C.K
        * Simple
        * Intuitive
        * Clean
        * Kickass

* Group in tables efficiently; need minimal tables used
    * Try to fit as many people as possible per table
    * When in conflicts, first come first serve

* Code to ensure longevity of code; needs to work for a long time after we're gone

* Consider Recursion/DP for algorithm
    * Like a inverted CoinChange Problem

* Security Measures
    * Encryption?
    * Consider fraud/duplicated/forgery/infiltration

* Agile Development Process
    * Constant contact with client
    * Make changes according to client requests asap
    * Client may suggest difficult tasks; Attempt first or reason them out of it
    * Make the best product possible
    * Meet->Plan->Design->Develop->Test->Evaluate->Repeat

=======================================
#           Project Structure

Be sure to document any classes added in here


##            Object Classes


### Student

* Stores student info
    * Name
    * ID
    * Group ID
    * Ticket
### Group
* Stores info of a group
    * Unique ID
    * ArrayList of Students
* Can store 1-10 Students

### Table

* Stores info of a Table
    * Table # (sequential)
    * ArrayList of Groups
* Max Student capacity of 10


##           Runner Classes


### Prom

* Main runner; does the heavy lifting and logic
* Static class
* Stores Tables
    * ArrayList of Tables


 ##           Utility Classes


### excelReader

* Acts as scanner for spreadsheet
    * Can be used to make Students
    * Use to create Groups
