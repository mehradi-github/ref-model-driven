# Stage 1: Build
FROM node:lts-alpine3.24 AS builder
WORKDIR /app
COPY package*.json ./
RUN npm ci --only=production

# Stage 2: Production
FROM node:lts-alpine3.24 
WORKDIR /app

COPY --from=builder /app/node_modules ./node_modules
COPY . .

EXPOSE 3000

USER node  # Security: run as non-root
CMD ["node", "start"]