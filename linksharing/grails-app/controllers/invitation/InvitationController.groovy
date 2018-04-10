package invitation

import grails.plugins.mail.MailService

class InvitationController {

    MailService mailService

    def sendMail() {
        println("printing params : " + params)
        println "InvitationController sendMail >> " + params.recieverEmail
        println "InvitationController bean >> " + mailService
        mailService.sendMail {
            to "${params.recieverEmail}"
            subject "Regarding Invitation For Topic : ${params.topicName}"
            text """Hey checkout this interesting topic I came across. 
<a href = "http://localhost:8080/subscription/subscribeThroughEmail')}">Click Here</a>
"""

//            html view: "/emails/hello", model: [param1: "value1", param2: "value2"]
        }
        render "done"
    }
}
