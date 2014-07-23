using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

namespace SlidingMenu.Activities
{
    [Activity(Label = "SlidingMenuExampleActivity", MainLauncher = true, Icon = "@drawable/icon")]
    class SlidingMenuExampleActivity : SlidingMenuParentActivity
    {
        protected override void SelectItem()
        {
            int x = 0;
            x++;
            //throw new NotImplementedException();
        }
    }
}