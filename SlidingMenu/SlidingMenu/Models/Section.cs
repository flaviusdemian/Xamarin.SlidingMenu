using System;
using System.Collections.Generic;
using Java.Lang;
using String = System.String;

namespace SlidingMenu.Models
{
    public class Section : Java.Lang.Object
    {
        public List<SectionItem> SectionItems = new List<SectionItem>();
        public String Title { get; set; }

        public void AddSectionItem(long id, String title, String icon)
        {
            SectionItems.Add(new SectionItem(id, title, icon));
        }
    }
}