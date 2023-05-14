<!DOCTYPE html>
<html>
<head>
    <title>Computer Data</title>
</head>
<body>
    <table style="border-collapse: collapse">
        <thead>
            <tr>
                <th style="border: 1px solid black; padding: 8px; text-align: left; background-color: lightgray;">Country</th>
                <th style="border: 1px solid black; padding: 8px; text-align: left; background-color: lightgray;">Timescale</th>
                <th style="border: 1px solid black; padding: 8px; text-align: left; background-color: lightgray;">Vendor</th>
                <th style="border: 1px solid black; padding: 8px; text-align: left;
                background-color: lightgray;">Units</th>
                <th style="border: 1px solid black; padding: 8px; text-align: left;
                background-color: lightgray;">Share</th>
            </tr>
        </thead>
        <tbody>
        <#list computers as computer>
            <tr>
                <td style="border: 1px solid black; padding: 8px; text-align: left;">${computer.country}</td>
                <td style="border: 1px solid black; padding: 8px; text-align: left;">${computer.timescale}</td>
                <td style="border: 1px solid black; padding: 8px; text-align: left;">${computer.vendor}</td>
                <td style="border: 1px solid black; padding: 8px; text-align: left;">${computer.units}</td>
                <td style="border: 1px solid black; padding: 8px; text-align: left;">${computer.share}%</td>
            </tr>
        </#list>
        <tr>
            <td style="border: 1px solid black; padding: 8px; text-align: left;
            background-color: yellow" colspan="3">Total</td>
            <td style="border: 1px solid black; padding: 8px; text-align: left;
            background-color: yellow">${totalUnits}</td>
            <td style="border: 1px solid black; padding: 8px; text-align: left;
            background-color: yellow">100%</td>
        </tr>
        </tbody>
    </table>
</body>
</html>