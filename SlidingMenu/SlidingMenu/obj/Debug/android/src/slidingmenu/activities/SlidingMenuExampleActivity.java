package slidingmenu.activities;


public class SlidingMenuExampleActivity
	extends slidingmenu.SlidingMenuParentActivity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("SlidingMenu.Activities.SlidingMenuExampleActivity, SlidingMenu, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SlidingMenuExampleActivity.class, __md_methods);
	}


	public SlidingMenuExampleActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SlidingMenuExampleActivity.class)
			mono.android.TypeManager.Activate ("SlidingMenu.Activities.SlidingMenuExampleActivity, SlidingMenu, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

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
