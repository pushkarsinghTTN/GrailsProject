grails {
    mail {
        host = "smtp.gmail.com"
        port = 25
        username = "pushkarsingh9914103064@gmail.com"
        password = "pushkar1234"
        props = ["mail.smtp.auth"                  : "true",
                 "mail.smtp.socketFactory.port"    : "465",
                 "mail.smtp.socketFactory.class"   : "javax.net.ssl.SSLSocketFactory",
                 "mail.smtp.socketFactory.fallback": "false"]
    }
}