def randomPortList
					4.times {
						def pycmd = "python -c \'import socket; s=socket.socket(); s.bind((\"\", 0)); print(s.getsockname()[1]); s.close()\'"
						def randomPort = sh(script: "${pycmd}", returnStdout: true).trim()
						println "drawn port: ${randomPort}"
						randomPortList.push(randomPort)
					}
					println "random ports for tests: ${RandomPortList}"
					
					
					if ((gitLocation.contains('backend') && (gitLocation.contains('billing-engine') && (gitLocation.contains('debit-inl')) {
						echo 'run mvn verify for merchant / billing / debit-inl'
						sh "mvn -U clean -Dspring.mail.port=${freePortSmtp} -Dmock-http-server-port=${freePortHttp} -Dinl.integration.port=${freePortInl} -Dinl.mock.port.v1=${freePortInlv1} verify"
						// junit test report
						junit '**/**/target/surefire-reports/*.xml,**/**/target/failsafe-reports/*.xml'
					} else if (gitLocation.contains('monitoring')) {
						sh "mvn -U -f pspm-ms-spring-boot-admin-server/pom.xml clean verify"
					} else {
						sh "mvn -U clean verify"
					}