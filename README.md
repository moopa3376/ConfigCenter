ConfigCenter
==

This project is designed to support distributed config management.
It uses RPC to support distributed feather.

modules:
--

* cc-client  
  
  You can construct your config object with `net.leeautumn.calling.clinet.ClientFactory` and your config service interface.  
  Of course you have to  implement your service interface in module cc-callingservice.
  

* cc-callingservice

  This module contains config service interface and its implement.  
  
* cc-common

  common module.
  
* cc-server

  contains server via using callingServiceServer.
  
  
Build
--

`sh build.sh` to compile and package ConfigServer.

Start Server
--

* get into directory `relaese/cc-server/bin`
* execute `sh cc-server-start.sh`