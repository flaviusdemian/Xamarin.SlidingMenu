using System;
using Android.App;
using Android.OS;
using SlidingMenu.Fragments;
using FragmentTransaction = Android.Support.V4.App.FragmentTransaction;

namespace SlidingMenu.Activities
{
    [Activity(Label = "SlidingMenuExampleActivity", MainLauncher = true, Icon = "@drawable/icon")]
    internal class SlidingMenuExampleActivity : SlidingMenuParentActivity
    {
        public static FragmentSample fragmentSample = new FragmentSample();

        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
        }

        protected override void SelectItem()
        {
            try
            {
                FragmentTransaction ft = SupportFragmentManager.BeginTransaction();
                ft.Replace(Resource.Id.content_frame, fragmentSample);
                ft.Commit();
                mDrawerListLeft.SetItemChecked(0, true);
                // Close drawer
                mDrawerLayout.CloseDrawer(mDrawerListLeft);
            }
            catch (Exception ex)
            {
                ex.ToString();
            }
        }
    }
}