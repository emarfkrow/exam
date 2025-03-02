/**
 * 複合グリッド定義
 */

let Tb7FukugoGridColumns = [];

$(function() {
    Tb7FukugoGridColumns = [
        Column.refer('SANSHO_ID', Messages['Tb7FukugoGrid.sanshoId'], 80, 'primaryKey', 'SANSHO_MEI'),
        Column.refer('SEIYAKU_ID', Messages['Tb7FukugoGrid.seiyakuId'], 80, 'primaryKey', 'SEIYAKU_MEI'),
        Column.date('TEKIYO_BI', Messages['Tb7FukugoGrid.tekiyoBi'], 80, 'primaryKey', Slick.Formatters.Extends.Date),
        Column.text('FUKUGO_INFO', Messages['Tb7FukugoGrid.fukugoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7FukugoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
