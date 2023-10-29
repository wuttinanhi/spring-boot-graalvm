FROM ghcr.io/graalvm/native-image-community:17-muslib

# RUN apt-get update && apt-get install -y \
#     zip unzip curl gcc

# RUN curl -s "https://get.sdkman.io" | bash

# RUN /bin/bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && sdk install java 22.3.r17-nik && sdk use java 22.3.r17-nik"

WORKDIR /build

COPY . .

# RUN /bin/bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && ./mvnw -Pnative native:compile"

RUN ./mvnw -Pnative native:compile
