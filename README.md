<b>Backend Code for UEN Query application<b/>

Works in Tandem with uen-query which contains the frontend code for the application


Requires creation of MySQL database schema called 'validus' running on localhost port 3306
with 
<br/>
<b>username : root<b/>
</br>
<b>password: 3aVetrkXRRmK8Cx<b/>

Upon running the application, first run the import data from gov to local database
This will instantiate the first 5000 records from the gov database to the local database
All required tables & columns will be automatically created upon running this

Once this is done, you can proceed to query from the government database or from the local database created

Take note, the local database only contains a portion of the records held by the government. It is possible to extract all the records but it seems like a redundant requirement as this is only meant for a technical assignment.
Hence, as long as the code logic is valid, it can be altered / scaled up to meet the requirements
