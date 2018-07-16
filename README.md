# Aqua-Term
cool-retro-terminal theme and other themed files, including linux secure delete and coreutils patch
# requires cool-retro-term and standard build utilities for C 
<br> gcc gcc-c++ automake usual Development Tools or C/C++ building files </br>




# build coreutils with patch for cp,mv,rm

<br> cd coreutils-8.21 </br>
<br> ./configure </br>
<br> make -j16                                 #where -j16 is 16 for processor cores for concurrency </br>
<br> cd src </br>

<br> sudo -i </br>
<br> cp -rf cp /usr/bin/cp.mod </br>
<br> cp -rf mv /usr/bin/mv.mod </br>

<br> mv /usr/bin/cp /usr/bin/cp.system.orig </br>
<br> mv /usr/bin/mv /usr/bin/mv.system.orig </br>

<br> cp -rf cp /usr/bin/cp </br>
<br> cp -rf mv /usr/bin/mv </br>




 # if something is not right after running this immediately with cp or mv 
 # cd coreutils-8.21/src where coreutils-8.21/src sits in a folder on the drive 
 # and make sure to run "./cp cp /usr/bin/ 
 # and make sure to run "./cp mv /usr/bin/ 

# secure-delete build
<br> tar -xvf secure-delete.tar.gz </br> 
<br> make -j16 </br> 
<br> cp srm /usr/bin/ </br> 
<br> cp smem /usr/bin/ </br> 
