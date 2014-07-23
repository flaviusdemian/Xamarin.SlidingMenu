package slidingmenu;


public abstract class SlidingMenuParentActivity
	extends com.actionbarsherlock.app.SherlockFragmentActivity
	implements
		mono.android.IGCUserPeer,
		android.widget.ExpandableListView.OnChildClickListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onChildClick:(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z:GetOnChildClick_Landroid_widget_ExpandableListView_Landroid_view_View_IIJHandler:Android.Widget.ExpandableListView/IOnChildClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("SlidingMenu.SlidingMenuParentActivity, SlidingMenu, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SlidingMenuParentActivity.class, __md_methods);
	}


	public SlidingMenuParentActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SlidingMenuParentActivity.class)
			mono.android.TypeManager.Activate ("SlidingMenu.SlidingMenuParentActivity, SlidingMenu, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public boolean onChildClick (android.widget.ExpandableListView p0, android.view.View p1, int p2, int p3, long p4)
	{
		return n_onChildClick (p0, p1, p2, p3, p4);
	}

	private native boolean n_onChildClick (android.widget.ExpandableListView p0, android.view.View p1, int p2, int p3, long p4);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
