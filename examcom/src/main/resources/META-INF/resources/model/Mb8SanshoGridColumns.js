/**
 * 参照マスタグリッド定義
 */

let Mb8SanshoGridColumns = [];

$(function() {
    Mb8SanshoGridColumns = [
        Column.text('SANSHO_ID', Messages['Mb8SanshoGrid.sanshoId'], 80, 'primaryKey numbering', null),
        Column.text('SANSHO_MEI', Messages['Mb8SanshoGrid.sanshoMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb8SanshoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
