docker exec -it rocketmq-broker sh mqadmin updateSubGroup -c rocketmq-broker:10911 -n rocketmq-namesrv:9876 -g test_group
docker exec -it rocketmq-broker sh mqadmin updateTopic -c rocketmq-broker:10911 -n rocketmq-namesrv:9876 -t xfg-dev-tech-rocketmq
docker exec -it rocketmq-broker sh mqadmin updateSubGroup -c rocketmq-broker:10911 -n rocketmq-namesrv:9876 -g test_group