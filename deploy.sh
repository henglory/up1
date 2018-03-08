echo "1. Preparation API"
cd toystore
mvn clean package -Dmaven.test.skip=true
cd ..
echo "2. Preparation Web"
yarn install
echo "3. Install all services with Docker compose"
docker-compose build
docker-compose up
