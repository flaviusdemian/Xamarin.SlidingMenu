package slidingmenu.models;


public class SectionItem
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("SlidingMenu.Models.SectionItem, SlidingMenu, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SectionItem.class, __md_methods);
	}


	public SectionItem () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SectionItem.class)
			mono.android.TypeManager.Activate ("SlidingMenu.Models.SectionItem, SlidingMenu, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public SectionItem (long p0, java.lang.String p1, java.lang.String p2) throws java.lang.Throwable
	{
		super ();
		if (getClass () == SectionItem.class)
			mono.android.TypeManager.Activate ("SlidingMenu.Models.SectionItem, SlidingMenu, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.Int64, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
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
