# Aqua-Term
cool-retro-terminal theme and other themed files, including linux secure delete and coreutils patch
# requires cool-retro-term standard build utilities for C, gcc gcc-c++ automake usual Development Tools or C/C++ building files


cd coreutils-8.21
./configure
make -j16                                 #where -j16 is 16 for processor cores for concurrency
cd src

sudo -i
cp -rf cp /usr/bin/cp.mod
cp -rf mv /usr/bin/mv.mod
cp -rf rm /usr/bin/rm.mod

mv /usr/bin/cp /usr/bin/cp.system.orig
mv /usr/bin/mv /usr/bin/mv.system.orig
mv /usr/bin/rm /usr/bin/rm.system.orig

cp -rf cp /usr/bin/cp
cp -rf mv /usr/bin/mv
cp -rf rm /usr/bin/rm




# if something is not right after running this immediately with cp or mv
# cd coreutils-8.21/src where coreutils-8.21/src sits in a folder on the drive
# and make sure to run "./cp cp /usr/bin/
# and make sure to run "./cp mv /usr/bin/
# and make sure to run "./cp rm /usr/bin/
