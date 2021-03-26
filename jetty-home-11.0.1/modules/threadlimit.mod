
[description]
Applies ThreadLimiteHandler to entire server

[tags]
server

[description]
Limit the threads per IP address for DOS protection.

[depend]
server

[xml]
etc/jetty-threadlimit.xml

[ini-template]
## Select style of proxy forwarded header
#jetty.threadlimit.forwardedHeader=X-Forwarded-For
#jetty.threadlimit.forwardedHeader=Forwarded

## Enabled by default?
#jetty.threadlimit.enabled=true

## Thread limit per remote IP
#jetty.threadlimit.threadLimit=10

