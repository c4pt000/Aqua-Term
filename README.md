
![s1](https://user-images.githubusercontent.com/46433702/64659158-45f4aa80-d408-11e9-8427-640ed5dffe87.gif)


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


if you found this useful, anything helps

1LzcsiiKveiDrPp6VGhQCg44dnQzqY2vNv

https://www.binance.com/userCenter/deposit.html      << for bitcoin mc/visa


![s1](https://i.imgur.com/py97aYA.png)



