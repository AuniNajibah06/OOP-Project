<?php
include 'db_connection.php';
$sql = "SELECT T.AcceptNo, T.Status, S.Supplier_Name, O.Order_Type, T.Local_Order_No, O.Order_Date, O.Delivery_Note, T.Date_Received FROM Asset T 
JOIN Equipment E ON T.Manufacturer_Series = E.Manufacturer_Series
JOIN Orders O ON E.Manufacturer_Series = O.Manufacturer_Series
JOIN Supplier S ON O.SupplierID = S.SupplierID";
$result = $conn->query($sql);

echo "<h2>Movable Asset Receipt Form</h2>
    <h2>KEW.PA-1</h2>";
if ($result->num_rows > 0) {
    echo "<table border = '1' cellpadding='5' cellspacing='0'>";
    echo "<tr><th>AcceptNo</th><th>Status</th><th>Supplier_Name</th><th>Order_Type</th><th>Local_Order_No</th><th>Order_Date</th><th>Delivery_Note</th><th>Date_Received</th></tr>";
    // Output data of each row 
    while ($row = $result->fetch_assoc()){
        echo "<tr>";
        echo "<td>" . $row['AcceptNo'] . "</td>";
        echo "<td>" . $row['Status'] . "</td>";
        echo "<td>" . $row['Supplier_Name'] . "</td>";
        echo "<td>" . $row['Order_Type'] . "</td>";
        echo "<td>" . $row['Local_Order_No'] . "</td>";
        echo "<td>" . $row['Order_Date'] . "</td>";
        echo "<td>" . $row['Delivery_Note'] . "</td>";
        echo "<td>" . $row['Date_Received'] . "</td>";
        echo "</tr>";
    }
    echo "</table>";
} else {
    //echo "Error in query: " . $conn->error;
    echo "Error: " . $e->getMessage();
    echo "No records found";
}

$sql2 = "SELECT E.Manufacturer_Series, E.Type, E.Brand_Model, T.AssetID, F.StaffID FROM Staff F
JOIN Asset T ON F.StaffID = T.StaffID
JOIN Equipment E ON T.Manufacturer_Series = E.Manufacturer_Series";
$result = $conn->query($sql2);

if ($result->num_rows > 0) {
    echo "<table border = '1' cellpadding='5' cellspacing='0'>";
    echo "<tr><th>Manufacturer_Series</th><th>Type</th><th>Brand_Model</th><th>AssetID</th><th>StaffID</th></tr>";
    // Output data of each row 
    while ($row = $result->fetch_assoc()){
        echo "<tr>";
        echo "<td>" . $row['Manufacturer_Series'] . "</td>";
        echo "<td>" . $row['Type'] . "</td>";
        echo "<td>" . $row['Brand_Model'] . "</td>";
        echo "<td>" . $row['AssetID'] . "</td>";
        echo "<td>" . $row['StaffID'] . "</td>";
        echo "</tr>";
    }
    echo "</table>";
} else {
    //echo "Error in query: " . $conn->error;
    echo "Error: " . $e->getMessage();
    echo "No records found";
}

$sql3 = "SELECT AssetID, Date_Received, Date_Register, Category,Location, StaffID, Manufacturer_Series";
$result = $conn2->query($sql3);

if ($result->num_rows > 0) {
    echo "<table border = '1' cellpadding='5' cellspacing='0'>";
    echo "<tr><th>AssetID</th><th>Date_Received</th><th>Date_Register</th><th>Category</th><th>Location</th>
    <th>StaffID</th><th>Manufacturer_Series</th></tr>";
    // Output data of each row 
    while ($row = $result->fetch_assoc()){
        echo "<tr>";
        echo "<td>" . $row['AssetID'] . "</td>";
        echo "<td>" . $row['Date_Received'] . "</td>";
        echo "<td>" . $row['Date_Register'] . "</td>";
        echo "<td>" . $row['Category'] . "</td>";
        echo "<td>" . $row['Location'] . "</td>";
        echo "<td>" . $row['StaffID'] . "</td>";
        echo "<td>" . $row['Manufacturer_Series'] . "</td>";
        echo "</tr>";
    }
    echo "</table>";
} else {
    //echo "Error in query: " . $conn2->error;
    echo "Error: " . $e->getMessage();
    echo "No records found";
}
$conn2->close();

// Close connection
// pg_close($conn2);
?>
