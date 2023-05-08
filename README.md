# OracleService2
This simple project shows how a read only user: C##BARNEY accesses a table in the FRED user/schema named employee
The entity Employee has a @Table(name="Employee, schema="FRED")

NOTE:
Somewhere in  Spring Data JPA, for the oracle driver or oracle database type... it doesn't like schemas starting with C##. As a result I had to resort in
naming the user with the EMPLOYEE table as FRED and not C##FRED (creating a common user with out the C## requires you run a special script.
This was created for a localhost so I used the hidden script.

NOTE II:
Oracle, by design doesn't like the Common User to own schemas.

http://www.dba-oracle.com/t_ora_65096_create_user_12c_without_c_prefix.htm
