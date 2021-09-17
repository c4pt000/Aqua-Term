notes for myself a gist I forked for android emulator 
https://gist.github.com/c4pt000/b0a362b83823e3a89ad8aaddcbdcbfe7

```
where /opt/android/android-sdk is path to CLI android-sdk
 export PATH=$PATH:/opt/android/android-sdk/tools/bin

 export ANDROID_SDK_ROOT=/opt/android/android-sdk
 export ANDROID_HOME=/opt/android/android-sdk

sdkmanager --sdk_root=${ANDROID_HOME} --install "platforms;android-28"
sdkmanager --sdk_root=${ANDROID_HOME} --install "system-images;android-28;google_apis_playstore;x86_64"
```
arm64
```
#/root/.bashrc alias
alias EMULATOR='emulator @Nexus-29-x86_64 -no-boot-anim -netdelay none -no-snapshot -wipe-data -skin 768x1280 &'

sdkmanager --install "system-images;android-29;google_apis_playstore;x86_64"

#support for arm with the x86 emulator with version 29+ and higher?
avdmanager --verbose create avd --force --name Nexus-29-x86_64  --package "system-images;android-29;google_apis_playstore;x86_64" 
```
>> /root/.bashrc
```
alias EMULATOR='emulator @Nexus-29-x86_64 -no-boot-anim -netdelay none -no-snapshot -wipe-data -skin 768x1280 &'
```
or alternatively
/usr/bin/EMULATOR
```
# gpu pipeline acceleration
# /opt/android/android-sdk/emulator/emulator @Nexus-29-x86_64 -gpu on &
/opt/android/android-sdk/emulator/emulator @Nexus-29-x86_64 &

```

added java8 and java11 fast switching scripts for ubuntu/debian based systems

added two files for /usr/bin 
requires both java8 and java11 installed for fast switching between versions

```
wget https://raw.githubusercontent.com/c4pt000/Aqua-Term/master/java11-switch-on
wget https://raw.githubusercontent.com/c4pt000/Aqua-Term/master/java8-switch-on
chmod +x /usr/bin/java11-switch-on
chmod +x /usr/bin/java8-switch-on
```

```
#java 11 switch
rm -rf /etc/alternatives/javac
rm -rf /etc/alternatives/java
ln -s /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-4.fc34.x86_64/bin/java /etc/alternatives/java
ln -s /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-4.fc34.x86_64/bin/javac /etc/alternatives/javac
java -version
javac -version
```
``` 
#!/bin/bash
#yum install java-1.8.0
rm -rf /etc/alternatives/javac
rm -rf /etc/alternatives/java
ln -s /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.292.b10-4.fc34.x86_64/bin/java /etc/alternatives/java
ln -s /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.292.b10-4.fc34.x86_64/bin/javac /etc/alternatives/javac
java -version
javac -version
```

* added MouseAntiLock.java (based on pre-existing sources, creates a tray icon of the Redhat logo) a simple program that disables the screensaver from starting by randomly repositioning the mouse pointer in different locations randomly 

```
javac MouseAntiLock.java
java MouseAntiLock
```

cairo-dock brit theme mod
as cairo-dock
where "user" is your user root or otherwise
<br>
<br>
<br>
<img src="https://raw.githubusercontent.com/c4pt000/Aqua-Term/master/Redhat-logo.png" data-canonical-src="https://raw.githubusercontent.com/c4pt000/Aqua-Term/master/Redhat-logo.png" width="50" height="50" />
<br>
<br>

![s1](https://raw.githubusercontent.com/c4pt000/Aqua-Term/master/cairo-dock-brit-mod.png)
<br>
<br>

```

chown -R user:user /home/user/.config/cairo-dock
chmod -R 755 /home/user/.config/cairo-dock

place in /home/user/.config/
------------------------------------
cd /home/user/.config
wget https://github.com/c4pt000/Aqua-Term/raw/master/cairo-dock.tar.gz
tar -xvf cairo-dock.tar.gz

```

# disable tool-tips

![s1](https://raw.githubusercontent.com/c4pt000/Aqua-Term/master/disable-tool-tips.png)
![s1](https://raw.githubusercontent.com/c4pt000/Aqua-Term/master/disable-tool-tips-apply.png)




# adjusting window title bar minimize, maximize, close for compiz users or macro users in general (mate desktop)
![s1](https://github.com/c4pt000/Aqua-Term/blob/master/adjusting-title-bar-size-1.png)
![s1](https://github.com/c4pt000/Aqua-Term/blob/master/adjusting-title-bar-size-2.png)

requires dconf-editor (gtk-window-decorator --replace &)


adjust dconf-editor of current logged in user to adjust title bar button size,
requires killilng gtk-window-decorator and restarting gtk-window-decorator with --replace

```
dconf-editor
ps ax | grep gtk-window-decorator
kill -9 (processid_of_gtk_window_decorator)
gtk-window-decorator --replace &
```


![s1](https://user-images.githubusercontent.com/46433702/64659158-45f4aa80-d408-11e9-8427-640ed5dffe87.gif)


* before running or using cpprogress_on or cpprogress_off to disable or enable cp with progress bar ,

* system copy command "cp" should be renamed to cp.orig and copy command from coreutils modified "cp" should be renamed to cp.mod 
* for certain system functions copy command "cp" requires extended xattr bits
* requires renaming /usr/bin/cp to /usr/bin/cp.orig and "modified" cp from coreutils from cp to /usr/bin/cp.mod
* the scripts cpprogress_on and cpprogress_off should be placed into /usr/bin/ as chmod +x to allow enable or disable of  graphical cp -g progress bar modified copy command 
* from coreutils in order to run commands such as dracut -f or when rpm install scripts require xattr copy command bits.
 
background animation is komorebi 
# * definite working with version 1.0.0 (cool-retro-term) for 1.1.1 use aqterm_bright-111.json


* update 09-11-19
# * recompile "cp" with progress bar with "xattr" enabled for extended attributes or use standard copy to avoid errors via systems using 'dracut' and other functions outside of Makefile compiling, along with initramfs errors from missing extended attributes, -> "xattr"

<br>
wget https://github.com/Swordfish90/cool-retro-term/releases/download/1.1.1/Cool-Retro-Term-1.1.1-x86_64.AppImage
<br>
chmod a+x Cool-Retro-Term-1.1.1-x86_64.AppImage
<br>
./Cool-Retro-Term-1.1.1-x86_64.AppImage
<br>
<br>
<br>
<br>
<br>
<br>

# * adjust .bashrc using bashrc to wrap terminal to parrotOS sec theme + cool-retro-term theme + secure functions
# * with cool-retro-term installed   (where USER is your username with 'whomai')
<br> sudo cp bashrc /root/.bashrc 
<br>
<br> and or 
<br>
<br> cp bashrc /home/USER/.bashrc 
<br>

<br> source /root/.bashrc 
<br>
<br>
and or
<br> 
source /home/USER/.bashrc 
<br>
* in ~/.bashrc
* alias rm='rm -drflvz'
<br>
added stability? to delete files and folders with "secure-rm" -> srm
<br>



macOS
<br>
brew cask install cool-retro-term

<br>
<br>
<br>
<br>
<br>

# * Fedora 28 (only?) large copy file error outside of cp, using coreutils copy patch for cp,

(not seen with CentOS7)

* coreutils patch for cp large files have malloc errors during copy causing "cool-retro-term" to overflow
* see coreutils-8.21 patch

<br>
echo 'export MALLOC_CHECK=3' >> /root/.bashrc
<br>
or
<br>
echo 'export MALLOC_CHECK=3' >> /home/"user"/.bashrc




 <br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

      
   


demo of terminal theme actively running
with https://github.com/c4pt000/Aqua-Term/blob/master/aqua_term-bright.json


https://github.com/c4pt000/Aqua-Term/releases/download/term-demo/aqua-term-demo.mkv
   
  




# *** NOT RESPONSIBLE FOR ANY FILE SYSTEM DAMAGE FROM USING THIS MOD + THEME, NOT RESPONSIBLE IF YOUR BOSS FIRES YOU FOR RUNNING THIS WHILE YOU WORK, OR ANY PSYCHOLOGIST OR PSYCHIATRIST BILLS OR ANY OTHER HAZARDS YOU MIGHT INCUR 


<br> issues with delete after running .bashrc with "source /root/.bashrc"  <br>
<br> seems as though when deleteing folders with a trailing / , the rm experiences an inconsistency,  <br>
<br> e.g.  <br>

# error like this with "rm"

<br> cp dir dir.edit <br>
<br> rm -r dir.edit/ <br>                                          

# folder will delete on a 0 exit no error with "rm"

<br> cp dir dir.edit  <br>
<br> rm -r dir.edit   <br>                                            




# Aqua-Term
cool-retro-terminal theme and other themed files, including linux secure delete and coreutils patch
# requires cool-retro-term and standard build utilities for C 
<br> gcc gcc-c++ automake usual Development Tools or C/C++ building files <br>

cd /opt
git clone https://github.com/c4pt00/Aqua-Term
cd /opt/Aqua-Term


# build coreutils with patch for cp,mv,rm

<br> cd coreutils-8.21 <br>
<br> ./configure <br>
<br> make -j16                                 #where -j16 is 16 for processor cores for concurrency <br>
<br> cd src <br>

<br> sudo -i <br>
<br> cp -rf cp /usr/bin/cp.mod <br>
<br> cp -rf mv /usr/bin/mv.mod <br>

<br> mv /usr/bin/cp /usr/bin/cp.system.orig <br>
<br> mv /usr/bin/mv /usr/bin/mv.system.orig <br>

<br> cp -rf cp /usr/bin/cp <br>
<br> cp -rf mv /usr/bin/mv <br>




 # if something is not right after running this immediately with cp or mv 
 # cd coreutils-8.21/src where coreutils-8.21/src sits in a folder on the drive 
 # and make sure to run "./cp cp /usr/bin/ 
 # and make sure to run "./cp mv /usr/bin/ 
 
 
 
<br><br>
<br><br>
<br><br>
<br><br>




# secure-delete build
<br> tar -xvf secure-delete.tar.gz 
<br> 
<br> cd secure-delete 
<br>
<br> make 
<br>  #concurrency -j breaks build process here
<br> cp srm /usr/bin/ 
<br> 
<br> cp smem /usr/bin/ 
<br> 




<br> run "cool-retro-term" <br>
<br> import aqua-term.json profile <br>
<br> note: it's possible to adjust curvature in profile settings <br>


<br> with dpkg installed <br> 
<br> cp parrot-themes_2.6+parrot6_all.deb / <br>
<br> cp maia-parrot-edit.tar.gz / <br>
<br> cd / <br>
<br> dpkg -x parrot-themes_2.6+parrot6_all.deb / <br>
<br> tar -xvf maia-parrot-edit.tar.gz <br>
<br> mv /usr/share/icons/maia /usr/share/icons/maia.orig <br>
cp -rf maia /usr/share/icons/maia


# for Smokey theme for Menu Bar
<br> cd /opt/Aqua-Term <br>
<br> sudo cp -rf gnome-themes_2.14.3-1_all.deb / <br>
<br> cd / <br>
<br> sudo dpkg -x gnome-themes_2.14.3-1_all.deb / <br>



<br>
<br>
<br>
<br>
<br>

