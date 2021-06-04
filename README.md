<p><span style="font-size: 26px;"><strong>A small android library that simplifies the use of SharedPreferences.</strong></span><em><br></em><br><br><strong><em><span style="font-size: 18px;">How do I add it to my project?</span></em></strong><br><br><strong><span style="font-size: 16px;">Step 1. Add the JitPack repository to your build file</span></strong><br><br>Add it in your root build.gradle at the end of repositories:</p>
<p><br></p>
<blockquote>
    <p>allprojects {<br>&nbsp; &nbsp; &nbsp; &nbsp; repositories {<br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; maven { url &apos;https://jitpack.io&apos; }<br>&nbsp; &nbsp; &nbsp; &nbsp; }<br>}</p>
</blockquote>
<p><br><strong>Step 2. Add the dependency</strong></p>
<p><br></p>
<blockquote>
    <p>dependencies {<br>&nbsp; &nbsp; &nbsp; &nbsp; implementation &apos;com.github.scoreboot:Simple-Data:1.0&apos;<br>}</p>
</blockquote>
<p><em><strong><br></strong></em><span style="font-size: 18px;"><strong><em>How do I use it?</em></strong></span></p>
<p><br></p>
<blockquote>
    <p>SPData.init(Context context);</p>
</blockquote>
<p><br></p>
<blockquote>
    <p></p>
    <p>SPData.setBoolean(String key, booleean value);</p>
    <p>SPData.getBoolean(String key, boolean default);</p>
</blockquote>
<p><br></p>
<blockquote>
    <p>SPData.setString(String key, String value);</p>
    <p>SPData.getString(String key, String default);</p>
</blockquote>
<p><br></p>
<blockquote>
    <p>SPData.setInteger(String key, int value);</p>
    <p>SPData.getInteger(String key, int default);</p>
</blockquote>
<p><br><br><br><br><br></p>
