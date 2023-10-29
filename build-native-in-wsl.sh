sdk install java 22.3.r17-nik
sdk use java 22.3.r17-nik
sudo apt install maven gcc build-essential zlib1g-dev libstdc++-11-dev g++ -y
mvn -Pnative native:compile
