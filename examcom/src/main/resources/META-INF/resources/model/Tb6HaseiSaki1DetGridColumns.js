/**
 * 派生先１明細グリッド定義
 */

let Tb6HaseiSaki1DetGridColumns = [];

$(function() {
    Tb6HaseiSaki1DetGridColumns = [
        Column.text('HASEI_SAKI1_ID', Messages['Tb6HaseiSaki1DetGrid.haseiSaki1Id'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_SAKI1_BN', Messages['Tb6HaseiSaki1DetGrid.haseiSaki1Bn'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_SAKI1_DET_INFO', Messages['Tb6HaseiSaki1DetGrid.haseiSaki1DetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiSaki1DetGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
