# Cloud Burner-Tenants in Java EE

This project provides a set of resource-intensive cloud-tenants, which can be used to simulate targeted load in cloud environments. It provides a GUI that allows you to:

* Start/Stop each burner
* Modify and update the tenants' running options

![picture of GUI](images/cloudBurnersGUI.png?raw=true)

There are five different burners provided:

* CPU: repeatedly decides if a large prime number is indeed prime. The user can control the number of threads used.
* Cache: creates a shared byte array (equal to L3 cache sizes of some contemporary CPUs) and repeatedly touches some cache line and then, yields the CPU. The user can control the number of threads used as well as the buffer and line sizes.
* Memory: creates non-shared byte arrays per thread and repeatedly touches some memory block and then, yields the CPU. The user can control the number of threads used as well as the buffer and page sizes.
* Disk: repeatedly opens a file, writes a number in it and closes it. The user can control the number of threads used.
* Network: establishes a connection to a network sink (the networkSink.c file provides one) and repeatedly sends the same message to it. The user can control the number of threads used, the name and port of the drain server as well as the size of the message.

The provided network sink is a multiprocess socket server written in C; it should be run on a remote machine to better induce network contention.  

## TODOs
- Validate form input
- User authentication
- Investigate more basic resources
- Make the GUI more user friendly, perhaps with JQuery and AJAX