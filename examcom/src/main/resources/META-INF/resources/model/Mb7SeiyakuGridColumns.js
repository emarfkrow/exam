/**
 * 制約マスタグリッド定義
 */

let Mb7SeiyakuGridColumns = [];

$(function() {
    Mb7SeiyakuGridColumns = [
        Column.text('SEIYAKU_ID', Messages['Mb7SeiyakuGrid.seiyakuId'], 80, 'primaryKey numbering', null),
        Column.text('SEIYAKU_MEI', Messages['Mb7SeiyakuGrid.seiyakuMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb7SeiyakuGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
