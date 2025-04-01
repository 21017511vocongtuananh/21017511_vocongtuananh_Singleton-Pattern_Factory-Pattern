# Sử dụng node:18-alpine làm base image
FROM node:18-alpine

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép package.json và package-lock.json để cài đặt dependencies trước
COPY package*.json ./

# Cài đặt dependencies
RUN npm install

# Sao chép toàn bộ mã nguồn vào container
COPY . .

# Build ứng dụng React
RUN npm run build

# Cấu hình để phục vụ ứng dụng React bằng serve
RUN npm install -g serve

# Mở cổng 3000
EXPOSE 3000

# Chạy ứng dụng với serve
CMD ["serve", "-s", "build", "-l", "3000"]
