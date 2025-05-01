/**
 * CD参照マスタグリッド定義
 */

let Mb4CdsanshoGridColumns = [];

$(function() {
    Mb4CdsanshoGridColumns = [
        Column.text('CDREF_CD', Messages['Mb4CdsanshoGrid.cdrefCd'], 90, 'primaryKey', null),
        Column.text('CDREF_MEI', Messages['Mb4CdsanshoGrid.cdrefMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb4CdsanshoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
