package sqldemo.b4a.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_main{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[main/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="txtUsername.Height=9%y"[main/General script]
views.get("txtusername").vw.setHeight((int)((9d / 100 * height)));
//BA.debugLineNum = 5;BA.debugLine="txtUsername.Width=45%x'-20dip"[main/General script]
views.get("txtusername").vw.setWidth((int)((45d / 100 * width)));
//BA.debugLineNum = 6;BA.debugLine="txtUsername.Top=20dip"[main/General script]
views.get("txtusername").vw.setTop((int)((20d * scale)));
//BA.debugLineNum = 7;BA.debugLine="txtUsername.HorizontalCenter=75%x"[main/General script]
views.get("txtusername").vw.setLeft((int)((75d / 100 * width) - (views.get("txtusername").vw.getWidth() / 2)));
//BA.debugLineNum = 9;BA.debugLine="txtAge.Height=9%y"[main/General script]
views.get("txtage").vw.setHeight((int)((9d / 100 * height)));
//BA.debugLineNum = 10;BA.debugLine="txtAge.Width=45%x'-20dip"[main/General script]
views.get("txtage").vw.setWidth((int)((45d / 100 * width)));
//BA.debugLineNum = 11;BA.debugLine="txtAge.Top=20dip"[main/General script]
views.get("txtage").vw.setTop((int)((20d * scale)));
//BA.debugLineNum = 12;BA.debugLine="txtAge.HorizontalCenter=25%x"[main/General script]
views.get("txtage").vw.setLeft((int)((25d / 100 * width) - (views.get("txtage").vw.getWidth() / 2)));
//BA.debugLineNum = 14;BA.debugLine="txtPassword.Height=9%y"[main/General script]
views.get("txtpassword").vw.setHeight((int)((9d / 100 * height)));
//BA.debugLineNum = 15;BA.debugLine="txtPassword.Width=45%x'-20dip"[main/General script]
views.get("txtpassword").vw.setWidth((int)((45d / 100 * width)));
//BA.debugLineNum = 16;BA.debugLine="txtPassword.Top=txtUsername.Bottom +5dip"[main/General script]
views.get("txtpassword").vw.setTop((int)((views.get("txtusername").vw.getTop() + views.get("txtusername").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 17;BA.debugLine="txtPassword.HorizontalCenter=75%x"[main/General script]
views.get("txtpassword").vw.setLeft((int)((75d / 100 * width) - (views.get("txtpassword").vw.getWidth() / 2)));
//BA.debugLineNum = 19;BA.debugLine="txtCountry.Height=9%y"[main/General script]
views.get("txtcountry").vw.setHeight((int)((9d / 100 * height)));
//BA.debugLineNum = 20;BA.debugLine="txtCountry.Width=45%x'-20dip"[main/General script]
views.get("txtcountry").vw.setWidth((int)((45d / 100 * width)));
//BA.debugLineNum = 21;BA.debugLine="txtCountry.Top=txtAge.Bottom +5dip"[main/General script]
views.get("txtcountry").vw.setTop((int)((views.get("txtage").vw.getTop() + views.get("txtage").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 22;BA.debugLine="txtCountry.HorizontalCenter=25%x"[main/General script]
views.get("txtcountry").vw.setLeft((int)((25d / 100 * width) - (views.get("txtcountry").vw.getWidth() / 2)));
//BA.debugLineNum = 24;BA.debugLine="cmdAdd.Height=15%y"[main/General script]
views.get("cmdadd").vw.setHeight((int)((15d / 100 * height)));
//BA.debugLineNum = 25;BA.debugLine="cmdAdd.Width=28%x'-20dip"[main/General script]
views.get("cmdadd").vw.setWidth((int)((28d / 100 * width)));
//BA.debugLineNum = 26;BA.debugLine="cmdAdd.Top=txtCountry.Bottom +5dip"[main/General script]
views.get("cmdadd").vw.setTop((int)((views.get("txtcountry").vw.getTop() + views.get("txtcountry").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 27;BA.debugLine="cmdAdd.HorizontalCenter=83%x"[main/General script]
views.get("cmdadd").vw.setLeft((int)((83d / 100 * width) - (views.get("cmdadd").vw.getWidth() / 2)));
//BA.debugLineNum = 29;BA.debugLine="cmdDelete.Height=15%y"[main/General script]
views.get("cmddelete").vw.setHeight((int)((15d / 100 * height)));
//BA.debugLineNum = 30;BA.debugLine="cmdDelete.Width=28%x'-20dip"[main/General script]
views.get("cmddelete").vw.setWidth((int)((28d / 100 * width)));
//BA.debugLineNum = 31;BA.debugLine="cmdDelete.Top=cmdAdd.Bottom +5dip"[main/General script]
views.get("cmddelete").vw.setTop((int)((views.get("cmdadd").vw.getTop() + views.get("cmdadd").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 32;BA.debugLine="cmdDelete.HorizontalCenter=83%x"[main/General script]
views.get("cmddelete").vw.setLeft((int)((83d / 100 * width) - (views.get("cmddelete").vw.getWidth() / 2)));
//BA.debugLineNum = 34;BA.debugLine="cmdEdit.Height=15%y"[main/General script]
views.get("cmdedit").vw.setHeight((int)((15d / 100 * height)));
//BA.debugLineNum = 35;BA.debugLine="cmdEdit.Width=28%x'-20dip"[main/General script]
views.get("cmdedit").vw.setWidth((int)((28d / 100 * width)));
//BA.debugLineNum = 36;BA.debugLine="cmdEdit.Top=cmdDelete.Bottom +5dip"[main/General script]
views.get("cmdedit").vw.setTop((int)((views.get("cmddelete").vw.getTop() + views.get("cmddelete").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 37;BA.debugLine="cmdEdit.HorizontalCenter=83%x"[main/General script]
views.get("cmdedit").vw.setLeft((int)((83d / 100 * width) - (views.get("cmdedit").vw.getWidth() / 2)));
//BA.debugLineNum = 39;BA.debugLine="cmdExit.Height=15%y"[main/General script]
views.get("cmdexit").vw.setHeight((int)((15d / 100 * height)));
//BA.debugLineNum = 40;BA.debugLine="cmdExit.Width=28%x'-20dip"[main/General script]
views.get("cmdexit").vw.setWidth((int)((28d / 100 * width)));
//BA.debugLineNum = 41;BA.debugLine="cmdExit.Top=cmdEdit.Bottom +5dip"[main/General script]
views.get("cmdexit").vw.setTop((int)((views.get("cmdedit").vw.getTop() + views.get("cmdedit").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 42;BA.debugLine="cmdExit.HorizontalCenter=83%x"[main/General script]
views.get("cmdexit").vw.setLeft((int)((83d / 100 * width) - (views.get("cmdexit").vw.getWidth() / 2)));
//BA.debugLineNum = 44;BA.debugLine="LVDb.Height=60%y"[main/General script]
views.get("lvdb").vw.setHeight((int)((60d / 100 * height)));
//BA.debugLineNum = 45;BA.debugLine="LVDb.Width=65%x'-20dip"[main/General script]
views.get("lvdb").vw.setWidth((int)((65d / 100 * width)));
//BA.debugLineNum = 46;BA.debugLine="LVDb.Top=txtPassword.Bottom +12dip"[main/General script]
views.get("lvdb").vw.setTop((int)((views.get("txtpassword").vw.getTop() + views.get("txtpassword").vw.getHeight())+(12d * scale)));
//BA.debugLineNum = 47;BA.debugLine="LVDb.HorizontalCenter=35%x"[main/General script]
views.get("lvdb").vw.setLeft((int)((35d / 100 * width) - (views.get("lvdb").vw.getWidth() / 2)));
//BA.debugLineNum = 50;BA.debugLine="Label1.Height=8%y"[main/General script]
views.get("label1").vw.setHeight((int)((8d / 100 * height)));
//BA.debugLineNum = 51;BA.debugLine="Label1.Width=95%x'-20dip"[main/General script]
views.get("label1").vw.setWidth((int)((95d / 100 * width)));
//BA.debugLineNum = 52;BA.debugLine="Label1.Top=LVDb.Bottom +5dip"[main/General script]
views.get("label1").vw.setTop((int)((views.get("lvdb").vw.getTop() + views.get("lvdb").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 53;BA.debugLine="Label1.HorizontalCenter=50%x"[main/General script]
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));

}
}