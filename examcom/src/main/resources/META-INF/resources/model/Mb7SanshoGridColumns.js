/**
 * 参照マスタグリッド定義
 */

let Mb7SanshoGridColumns = [];

$(function() {
    Mb7SanshoGridColumns = [
        Column.text('SANSHO_ID', Messages['Mb7SanshoGrid.sanshoId'], 80, 'primaryKey numbering', null),
        Column.text('SANSHO_MEI', Messages['Mb7SanshoGrid.sanshoMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb7SanshoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
