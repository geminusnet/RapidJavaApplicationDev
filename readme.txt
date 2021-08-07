README for:
Rapid Java[tm] Application Development Using Sun[tm] ONE Studio
by Y. Daniel Liang
Copyright 2003 Pearson Education, Inc. All rights reserved.
Text ISBN: 0-13-047378-2
CD t/a Text ISBN: 0-13-047370-7
-----------------------------------------------------------------------

MINIMUM SYSTEM REQUIREMENTS:

WINDOWS:
* In order to use everything on this CD, you need to be running 
  Windows 2000 Professional (with latest service packs), Windows XP, 
  Windows NT (with service pack6) or Windows 98, 2nd edition only. 
* To use everything, at a minimum you need to have a 500 MHz (minimum) 
  Pentium III or faster processor. Sun[tm] ONE Studio 4, Community 
  Edition (formerly Forte[tm] for Java[tm] 4, Community Edition) 
  requires a minimum 500 MHz processor.
* To use everything under Microsoft Windows you need a minimum of 
  256 Mb of RAM.
* Screen Resolution 256 Color @ 800 x 600 (minimum)
* Required third-party software
   - Internet Browser (Internet Explorer 5.0 or higher)
   - If you do not have Adobe(R) Acrobat(R) Reader(R) installed on you 
     computer, check on the latest version of Acrobat Reader at...
		http://www.adobe.com/products/acrobat/readstep.html
* Required hardware 
   - CD drive
* Sound Card (Optional: for audio playback if necessary)
* Internet Connection
* To install everything on the CD, it is recommended that you have at 
  least 400 Mb of hard disk space available.

LINUX:
* Red Hat Linux 7.2 is the required Linux platform. 
* To use everything, at a minimum you need to have a 500 MHz (minimum) 
  Pentium III or faster processor. Sun[tm] ONE Studio 4, Community 
  Edition (formerly Forte[tm] for Java[tm] 4, Community Edition) 
  requires a minimum 500 MHz processor.
* To use everything under Linux, you need a minimum of 256 MB of RAM, 
  but 512 MB of RAM is recommended. 
   - This is because the Linux JVM is more resource-intensive, so you 
     may want to have a higher memory configuration.
* Screen Resolution 256 Color @ 800 x 600 (minimum)
* A standard graphics display card is adequate. 
* Required third-party software
   - Internet Browser 
   - If you do not have Adobe(R) Acrobat(R) Reader(R) installed on you 
     computer, check on the latest version of Acrobat Reader at...
		http://www.adobe.com/products/acrobat/readstep.html
* Required hardware 
   - CD drive
* Sound Card (Optional: for audio playback if necessary)
* Internet Connection
* To install everything on the CD, it is recommended that you have at 
  least 400 MB of hard disk space available. 

Please refer to the 'Software Installation Requirements and 
Dependencies Chart' which gives a detailed break down of each 
application on this CD and it's installation requirements. The 
'Software Installation Requirements and Dependencies Chart' is 
located on the following pages.

WINDOWS: html\windows\win_main.htm or html\windows\win_install-main.htm
LINUX: html\linux\lin_main.htm or html\linux\lin_install-main.htm

-----------------------------------------------------------------------

CD CONTENTS:
The contents of this CD are designed to be accessed through the 
interface provided in the file 'autorun.exe'. If a startup screen did 
not pop up automatically when you inserted the CD into your computer, 
double click on the icon for 'autorun.exe' to launch the program.

If your computer uses an operating system other than Microsoft Windows, 
such as Macintosh OS, Solaris, or Linux, you will not be able to take 
advantage of this feature.

Directory Information:

* 'example' directory

Windows Users: 
The source code for examples are in one zip file 
example.zip. To run the sample, please install it into c:\radft. 
If you unzip it using WinZip, enter c:\ in the Extract to field and 
check Use folder names. If you do not have WinZip installed on your 
computer you can download a free evaluation copy at www.winzip.com. 

Unix Users: 
Contains source code for examples in one file example.tar.gz. To run 
the sample, please install it into home\radft using the 
following commands:

	gunzip example.tar.gz
	tar -xvf example.tar

* 'exercise' directory

Windows Users: 
Contains solutions to even numbered exercises in one zip file
evennumberedexercise.zip. The exercises are in the directory named as
exercisex_y for the yth exercise in Chapter x. Window users, if you unzip
it using WinZip, enter c:\ in the Extract to field and check Use folder
names. If you do not have WinZip installed on your computer you can
download a free evaluation copy at www.winzip.com. 

To run the exercises without modification, unzip
evennumberedexercise.zip to c:\radftexercise. 

Unix Users:
Contains solutions to even numbered exercises in one file
evennumberedexercise.tart.gz. The exercises are in the directory named as
exercisex_y for the yth exercise in Chapter x. 

To run the sample, please install it into home\radft using the following 
commands:

	gunzip evennumberedexercise.tart.gz

	tar -xvf evennumberedexercise.tar

* 'review' directory: 
Contains PDFs of chapter-by-chapter answers to review questions.

* 'software-pdfs' directory: 
Contains a PDF of the Forte[tm] for Java[tm] 4, Community Edition 
Getting Started Guide. It has detailed installation information 
for the software that is supplied on this CD.

-----------------------------------------------------------------------

SOFTWARE PROGRAMS ON THIS CD:

WINDOWS:
   * Java[tm] 2 Software Development Kit, Standard Edition, Version 1.4.0
   * Sun[tm] ONE Studio 4, Community Edition 
     (formerly Forte[tm] for Java[tm] 4, Community Edition)
   
LINUX:
   * Java[tm] 2 Software Development Kit, Standard Edition, Version 1.4.0
   * Sun[tm] ONE Studio 4, Community Edition 
     (formerly Forte[tm] for Java[tm] 4, Community Edition)

-----------------------------------------------------------------------

INSTALLING THE SOFTWARE MANUALLY (WINDOWS)
Note: If your CD ROM drive uses a letter other than "D", 
type that letter instead.

* Java[tm] 2 Software Development Kit, Standard Edition, Version 1.4.0
   * Choose Run on your Start Menu.
   * Type D:\software-win\sj-sdk\j2sdk-1_4_0-win.exe in the text box 
     and click OK.
   * Follow the instructions as they appear on screen.
-------

* Sun[tm] ONE Studio 4, Community Edition
   * Choose Run on your Start Menu.
   * Type D:\software-win\s1s4\ffj_ce_win32_en.exe in the text 
     box and click OK.
   * Follow the instructions as they appear on screen.
-------


INSTALLING THE SOFTWARE MANUALLY (LINUX)
Note: If your CD ROM drive uses a letter other than "D", 
type that letter instead.

* Java[tm] 2 Software Development Kit, Standard Edition, Version 1.4.0

  The Java[tm] 2 SDK, Standard Edition, v1.4.0 is available in two 
  installation formats. Both files are located in the 
  'software-lin/sj-sdk' directory on the root level of this CD-ROM. 
  You only need to install one.
  
  Self-Extracting Binary
	A self-extracting binary file named 'j2sdk-1_4_0-linux-i386.bin' 
	which can be used to install the Java 2 SDK in any location you 
	choose, is located here... 
		D:\software-lin\sj-sdk\j2sdk-1_4_0-linux-i386.bin

  RPM File
	The file 'j2sdk-1_4_0-linux-i386-rpm.bin' containing RPM packages 
	comprising the Java 2 SDK, is located here...
		D:\software-lin\sj-sdk\j2sdk-1_4_0-linux-i386-rpm.bin

  Please refer to 
     D:\html\linux\lin_inst-j2se.htm 
  for detailed installation instructions.
-------

* Sun[tm] ONE Studio 4, Community Edition
	The installer file is located here...
		D:\software-lin\forte\s1s4\ffj_ce_linux_en.bin
	
  Please refer to 
     D:\html\linux\lin_inst-s1s4.htm
  for detailed installation instructions.

-----------------------------------------------------------------------

PEARSON EDUCATION TECHNICAL SUPPORT
No technical support for this CD is offered by the authors, the 
software vendors, or Pearson Education. 

However, if you have questions specifically relating to the 
installation process, you can contact Media Support by calling 
1-800-677-6337 between 8:00 a.m. and 5:00 p.m. CST, Monday through 
Friday. You can also get support by filling out the web form 
located at...

http://247.pearsoned.com/mediaform.html

You should have the following information ready: 
	* Product Title and Product ISBN
	* Computer Make and Model 
	* RAM Available 
	* Hard Disk Space Available 
	* Graphics Card Type 
	* Sound Card Type 
	* Printer Make And Model 
	* Network Connection 
	* Detailed description of the problem, including the 
	  exact wording of any error messages

If you believe that your CD media is defective, you may send it to 
Pearson Education to exchange for a replacement disk. The new disk can 
only be sent upon receipt of the defective disk. 

Send the defective disk, along with your name and address, to: 
	Computer Science Editor 
	Pearson Education 
	1 Lake Street 
	Upper Saddle River, NJ 07458
