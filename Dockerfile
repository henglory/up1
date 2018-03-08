FROM node:9.7.1-alpine as builder
WORKDIR /ws
COPY . /ws
RUN yarn build

FROM nginx:1.13.9-alpine
COPY --from=builder /ws/build /usr/share/nginx/html
COPY --from=builder /ws/nginx.conf /etc/nginx/nginx.conf
