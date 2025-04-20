/**
 * 複合グリッド定義
 */

let Tb8FukugoGridColumns = [];

$(function() {
    Tb8FukugoGridColumns = [
        Column.refer('SANSHO_ID', Messages['Tb8FukugoGrid.sanshoId'], 90, 'primaryKey', 'SANSHO_MEI'),
        Column.refer('SEIYAKU_ID', Messages['Tb8FukugoGrid.seiyakuId'], 90, 'primaryKey', 'SEIYAKU_MEI'),
        Column.date('TEKIYO_BI', Messages['Tb8FukugoGrid.tekiyoBi'], 90, 'primaryKey', Slick.Formatters.Extends.Date),
        Column.text('FUKUGO_INFO', Messages['Tb8FukugoGrid.fukugoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb8FukugoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
