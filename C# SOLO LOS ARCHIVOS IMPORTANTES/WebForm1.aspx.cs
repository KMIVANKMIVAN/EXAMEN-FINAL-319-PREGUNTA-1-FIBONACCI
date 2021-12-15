using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace FIBONA
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnCal_Click(object sender, EventArgs e)
        {
			//int n1 = Convert.ToInt32(txtNum1.Text.ToString().Trim());
			//int cantidad = Convert.ToInt32(txtNum1.Text.ToString().Trim());
            int n1 = 0, n2 = 1, n3, i, number;
            string a = "";
            //Console.Write("Enter the number of elements: ");
            number = int.Parse(txtNum1.Text.ToString().Trim());
            number = number - 1;
            lblRes1.Text = n1 + " " + n1 + " " + n2 + " "; //printing 0 and 1    
            for (i = 2; i < number; ++i) //loop starts from 2 because 0 and 1 are already printed    
            {
                n3 = n1 + n2;
                a = a + " " + n3.ToString() ;
                n1 = n2;
                n2 = n3;
            }
            //lblRes1.Text = n1 + " " + n1 + " " + n2 + " ";
            lblRes.Text = a;
        }
    }
}