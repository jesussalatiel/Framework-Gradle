#Build Jenkins with BlueOcean
FROM jenkins/jenkins:2.346.2-jdk11

USER root

ENV DISPLAY=:0
RUN echo $DISPLAY

# Set up Xvfb as in Linux servers there is no display by default
RUN apt-get update && apt-get install -y lsb-release
RUN curl -fsSLo /usr/share/keyrings/docker-archive-keyring.asc \
  https://download.docker.com/linux/debian/gpg
RUN echo "deb [arch=$(dpkg --print-architecture) \
  signed-by=/usr/share/keyrings/docker-archive-keyring.asc] \
  https://download.docker.com/linux/debian \
  $(lsb_release -cs) stable" > /etc/apt/sources.list.d/docker.list
RUN apt-get update && apt-get install -y docker-ce-cli

# Install  xvfb is a display server protocol and avoid tests failed
RUN apt-get install -y xvfb
RUN xvfb :0 -screen 0 1024x768x24 &> xvfb.log &

# Preinstall needed plugins
RUN jenkins-plugin-cli --plugins "blueocean:1.25.5 docker-workflow:1.28"
#RUN /usr/local/bin/install-plugins.sh blueocean

USER jenkins

