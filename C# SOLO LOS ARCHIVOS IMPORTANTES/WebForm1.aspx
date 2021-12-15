<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="FIBONA.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <a>DIGITE DE QUE NUMERO QUIERE LA SERIE FIBONACCI TIENE QUE SER SER MAYOR O IGUAL A 4</a><br />
            <asp:TextBox ID="txtNum1" type="number" runat="server"></asp:TextBox><br />
            <asp:Button ID="btnCal" runat="server" Text="VER FIBONACCI" OnClick="btnCal_Click" /><br />
            <asp:Label ID="lblRes1" runat="server" Text="LA SERIE ES: "></asp:Label><asp:Label ID="lblRes" runat="server" Text=""></asp:Label>
            
        </div>
    </form>
</body>
</html>
