package BuilderDesignAssinment;

public class Query {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    private Query(QueryBuilder QueryBuilderRef){
        this.select = QueryBuilderRef.select;
        this.from = QueryBuilderRef.from;
        this.where = QueryBuilderRef.where;
        this.join = QueryBuilderRef.join;
        this.orderBy = QueryBuilderRef.orderBy;
        this.groupBy = QueryBuilderRef.groupBy;
    }



    public static QueryBuilder getBuilder(){
        return new QueryBuilder();
    }

    public static class QueryBuilder {
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public QueryBuilder getSelect(String select){
            this.select = select;
            return this;
        }
        public QueryBuilder getFrom(String objectName){
            this.from = objectName;
            return this;
        }

        public QueryBuilder getWhere(String filter){
            this.where = filter;
            return this;
        }

        public QueryBuilder getJoin(String objectName){
            this.join = objectName;
            return this;
        }
        public QueryBuilder getOrderBy(String objectName){
            this.orderBy = objectName;
            return this;
        }
        public QueryBuilder getGroupBy(String objectName){
            this.groupBy = objectName;
            return this;
        }

        public Query build(){
            return new Query(this);
        }
    }

}
