package com.hellofresh.invoicemanagement.controller

import org.h2.server.TcpServer
import org.h2.tools.Server
import org.springframework.context.event.ContextClosedEvent
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class H2Controller {

    val webServer: Server = Server.createWebServer("-webPort", "8082")
    val tcpServer: TcpServer = TcpServer()

    @EventListener(ContextRefreshedEvent::class)
    fun start() {
        webServer.start()
        tcpServer.start()
    }

    @EventListener(ContextClosedEvent::class)
    fun stop() {
        webServer.stop()
        tcpServer.stop()
    }
}